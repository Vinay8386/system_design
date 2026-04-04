package HLD_Rate_limiting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * SlidingWindowCounterRateLimiter implements the Sliding Window Counter
 * rate limiting algorithm.
 *
 * This approach approximates sliding window behavior by keeping
 * request counts for the current and previous fixed windows and
 * calculating a weighted request count.
 *
 * It offers a good balance between accuracy and performance and
 * avoids the high memory cost of storing per-request timestamps.
 */
public class SlidingWindowCounterRateLimiter {

    private static final int LIMIT = 5;
    private static final long WINDOW_SIZE = 60_000L;

    private static class Window {
        long windowStart;
        int count;

        Window(long windowStart) {
            this.windowStart = windowStart;
            this.count = 0;
        }
    }

    /*
     * Stores current and previous window data for each user.
     */
    private final Map<String, Window> currentWindow = new ConcurrentHashMap<>();
    private final Map<String, Window> previousWindow = new ConcurrentHashMap<>();

    /**
     * Determines if a request from a specific user should be allowed based on the
     * Sliding Window Counter rate limiting algorithm.
     * * <p>This method calculates a weighted average of requests from the current
     * and previous time windows to estimate the total requests in the last
     * {@code WINDOW_SIZE} milliseconds.</p>
     * * <p>Algorithm logic:
     * 1. Identify the start of the current time bucket using modulo arithmetic.
     * 2. Retrieve (or initialize) the current and previous windows for the user.
     * 3. If the stored window is outdated, slide the window forward.
     * 4. Calculate the 'weight' of the previous window based on how much time
     * has elapsed in the current window.
     * 5. Allow the request if the estimated count is below the {@code LIMIT}.</p>
     *
     * @param userId The unique identifier for the user or client making the request.
     * @return {@code true} if the request is within the allowed limit;
     * {@code false} otherwise.
     */
    public boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();

        // Calculate the beginning of the current time bucket (e.g., the start of this minute)
        long currentWindowStart = currentTime - (currentTime % WINDOW_SIZE);

        // Ensure the maps are initialized for the user to avoid NullPointerExceptions
        currentWindow.putIfAbsent(userId, new Window(currentWindowStart));
        previousWindow.putIfAbsent(userId, new Window(currentWindowStart - WINDOW_SIZE));

        Window curr = currentWindow.get(userId);
        Window prev = previousWindow.get(userId);

        // Synchronize on the window object to ensure thread-safe updates to the counters
        synchronized (curr) {

            // Check if the window has shifted (i.e., we have moved into a new time bucket)
            if (curr.windowStart != currentWindowStart) {
                // Slide the current window into the 'previous' slot and create a new current window
                previousWindow.put(userId, curr);
                curr = new Window(currentWindowStart);
                currentWindow.put(userId, curr);

                // Refresh the reference to the previous window
                prev = previousWindow.get(userId);
            }

            // Calculate how far we are into the current window (in milliseconds)
            long elapsed = currentTime - curr.windowStart;

            // Calculate the weight of the previous window (percentage of overlap)
            double weight = (double) (WINDOW_SIZE - elapsed) / WINDOW_SIZE;

            // Estimate total requests: (Previous Requests * Weight) + Current Requests
            double estimatedCount = (prev.count * weight) + curr.count;

            if (estimatedCount < LIMIT) {
                curr.count++;
                return true;
            }

            return false;
        }
    }
}

