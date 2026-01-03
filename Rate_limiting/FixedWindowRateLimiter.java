package Rate_limiting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * FixedWindowRateLimiter implements the Fixed Window Counter
 * rate limiting algorithm.
 *
 * It allows a fixed number of requests within a fixed time window
 * for each user.
 *
 * When the time window expires, the counter is reset.
 *
 * This approach is simple and efficient, but it has a known limitation:
 * it can allow traffic spikes at window boundaries.
 */
public class FixedWindowRateLimiter {

    /*
     * Maximum number of requests allowed in a single window.
     */
    private static final int LIMIT = 5;

    /*
     * Duration of the window in milliseconds (1 minute).
     */
    private static final long WINDOW_SIZE = 60_000L;

    /*
     * Represents a fixed time window for a single user.
     * It tracks the start time of the window and the number of
     * requests made within that window.
     */
    private static class Window {

        /*
         * Start time of the current window in milliseconds.
         */
        long windowStart;

        /*
         * Number of requests processed in the current window.
         */
        int count;

        /*
         * Creates a new window starting at the given time.
         */
        Window(long windowStart) {
            this.windowStart = windowStart;
            this.count = 0;
        }
    }

    /*
     * Stores the window information for each user.
     * ConcurrentHashMap is used to support concurrent access in a multithreaded environment.
     */
    private final Map<String, Window> userWindow = new ConcurrentHashMap<>();

    /*
     * Checks whether a request from a given user is allowed
     * based on the fixed window rate limiting logic.
     *
     * If the current window has expired, it resets the window.
     * If the request count exceeds the limit, the request is blocked.
     */
    public boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();

        userWindow.putIfAbsent(userId, new Window(currentTime));
        Window window = userWindow.get(userId);

        /*
        We use the synchronized block to ensure that checking and updating the request count happens atomically, so multiple threads do not allow more requests than the defined limit.
         */
        synchronized (window) {
            // Reset the window if it has expired
            if (currentTime - window.windowStart >= WINDOW_SIZE) {
                window.windowStart = currentTime;
                window.count = 0;
            }

            // Allow request if limit is not exceeded
            if (window.count < LIMIT) {
                window.count++;
                return true;
            }

            // Block request if limit is exceeded
            return false;
        }
    }
}

