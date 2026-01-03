package Rate_limiting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * TokenBucketRateLimiter implements the Token Bucket
 * rate limiting algorithm.
 *
 * A bucket holds tokens which are refilled at a fixed rate.
 * Each incoming request consumes one token.
 *
 * If no token is available, the request is rejected.
 * This algorithm allows short bursts while maintaining
 * an average rate limit.
 */
public class TokenBucketRateLimiter {

    private static final int CAPACITY = 5;
    private static final int REFILL_RATE = 5; // tokens per minute
    private static final long REFILL_INTERVAL = 60_000L;

    private static class Bucket {
        int tokens;
        long lastRefillTime;

        Bucket() {
            this.tokens = CAPACITY;
            this.lastRefillTime = System.currentTimeMillis();
        }
    }

    private final Map<String, Bucket> userBuckets = new ConcurrentHashMap<>();

    /*
     * Determines whether a request should be allowed.
     * Tokens are refilled lazily during request handling.
     */
    public boolean allowRequest(String userId) {
        userBuckets.putIfAbsent(userId, new Bucket());
        Bucket bucket = userBuckets.get(userId);

        synchronized (bucket) {
            refillTokens(bucket);

            if (bucket.tokens > 0) {
                bucket.tokens--;
                return true;
            }

            return false;
        }
    }

    /*
     * Refills tokens based on elapsed time since last refill.
     */
    private void refillTokens(Bucket bucket) {
        long now = System.currentTimeMillis();
        long elapsedTime = now - bucket.lastRefillTime;

        if (elapsedTime >= REFILL_INTERVAL) {
            int tokensToAdd = (int) ((elapsedTime / REFILL_INTERVAL) * REFILL_RATE);
            bucket.tokens = Math.min(CAPACITY, bucket.tokens + tokensToAdd);
            bucket.lastRefillTime = now;
        }
    }
}

