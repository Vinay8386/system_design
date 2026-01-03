package Rate_limiting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * LeakyBucketRateLimiter implements the Leaky Bucket
 * rate limiting algorithm.
 *
 * Requests are added to a bucket and processed
 * at a constant rate, regardless of how fast
 * requests arrive.
 *
 * If the bucket becomes full, new requests
 * are rejected.
 */
public class LeakyBucketRateLimiter {

    private static final int CAPACITY = 5;
    private static final int LEAK_RATE = 1; // requests per second

    private static class Bucket {
        int currentSize;
        long lastLeakTime;

        Bucket() {
            this.currentSize = 0;
            this.lastLeakTime = System.currentTimeMillis();
        }
    }

    private final Map<String, Bucket> userBuckets = new ConcurrentHashMap<>();

    /*
     * Determines whether a request should be accepted
     * based on Leaky Bucket logic.
     */
    public boolean allowRequest(String userId) {
        userBuckets.putIfAbsent(userId, new Bucket());
        Bucket bucket = userBuckets.get(userId);

        synchronized (bucket) {
            leak(bucket);

            if (bucket.currentSize < CAPACITY) {
                bucket.currentSize++;
                return true;
            }

            return false;
        }
    }

    /*
     * Removes requests from the bucket based on
     * how much time has passed since the last leak.
     */
    private void leak(Bucket bucket) {
        long now = System.currentTimeMillis();
        long elapsedTime = now - bucket.lastLeakTime;

        int leakedRequests = (int) ((elapsedTime / 1000) * LEAK_RATE);

        if (leakedRequests > 0) {
            bucket.currentSize = Math.max(0, bucket.currentSize - leakedRequests);
            bucket.lastLeakTime = now;
        }
    }
}

