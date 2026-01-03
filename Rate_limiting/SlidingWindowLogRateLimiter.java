package Rate_limiting;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/*
 * SlidingWindowLogRateLimiter implements the Sliding Window Log
 * rate limiting algorithm.
 *
 * Instead of dividing time into fixed windows, this algorithm
 * continuously checks how many requests were made in the
 * last configured time period.
 *
 * It completely solves the boundary problem seen in the
 * Fixed Window Counter approach.
 *
 * However, it stores the timestamp of every request, which
 * makes it memory-intensive for high traffic systems.
 */
public class SlidingWindowLogRateLimiter {

    /*
     * Maximum number of requests allowed within the sliding window.
     */
    private static final int LIMIT = 5;

    /*
     * Size of the sliding window in milliseconds.
     * Here, the window represents the last 1 minute.
     */
    private static final long WINDOW_SIZE = 60_000L;

    /*
     * Stores request timestamps for each user.
     *
     * Key   -> user identifier (userId, IP address, API key, etc.)
     * Value -> deque containing timestamps of requests
     */
    private final Map<String, Deque<Long>> userRequestLog = new ConcurrentHashMap<>();

    /*
     * Checks whether a request from a given user should be allowed
     * based on the Sliding Window Log rate limiting logic.
     *
     * The method performs the following steps:
     * 1. Removes timestamps that fall outside the sliding window.
     * 2. Counts the remaining timestamps.
     * 3. Allows the request if the count is below the limit.
     */
    public boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();

        // Create a request log for the user if it does not already exist
        userRequestLog.putIfAbsent(userId, new ConcurrentLinkedDeque<>());
        Deque<Long> timestamps = userRequestLog.get(userId);

        synchronized (timestamps) {

            // Remove requests that are older than the sliding window
            while (!timestamps.isEmpty()
                    && currentTime - timestamps.peekFirst() >= WINDOW_SIZE) {
                timestamps.pollFirst();
            }

            // Check if the request can be allowed
            if (timestamps.size() < LIMIT) {
                timestamps.addLast(currentTime);
                return true;
            }

            // Reject the request if the rate limit is exceeded
            return false;
        }
    }
}

