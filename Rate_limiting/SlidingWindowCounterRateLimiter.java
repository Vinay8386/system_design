package Rate_limiting;

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

    /*
     * Determines whether a request should be allowed based on the
     * Sliding Window Counter logic.
     */
    public boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();
        long currentWindowStart = currentTime - (currentTime % WINDOW_SIZE);

        currentWindow.putIfAbsent(userId, new Window(currentWindowStart));
        previousWindow.putIfAbsent(userId, new Window(currentWindowStart - WINDOW_SIZE));

        Window curr = currentWindow.get(userId);
        Window prev = previousWindow.get(userId);

        synchronized (curr) {

            if (curr.windowStart != currentWindowStart) {
                previousWindow.put(userId, curr);
                currentWindow.put(userId, new Window(currentWindowStart));

                curr = currentWindow.get(userId);
                prev = previousWindow.get(userId);
            }

            long elapsed = currentTime - curr.windowStart;
            double weight = (double) (WINDOW_SIZE - elapsed) / WINDOW_SIZE;

            double estimatedCount = prev.count * weight + curr.count;

            if (estimatedCount < LIMIT) {
                curr.count++;
                return true;
            }

            return false;
        }
    }
}

