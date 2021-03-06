package com.lapots.breed.judge.repository;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Simple in-memory cache for player levels.
 */
@Component
public class InMemoryPlayerLevelCache {

    private ConcurrentMap<Integer, Long> levelExpr = new ConcurrentHashMap<>();

    /**
     * Gets element from cache.
     * @param level level
     * @return experience for level
     */
    public Long get(int level) {
        return levelExpr.get(level);
    }

    /**
     * Puts element to cache.
     * @param level level
     * @param exp experience for level
     */
    public void put(int level, long exp) {
        levelExpr.put(level, exp);
    }

    /**
     * Returns size of cache.
     * @return size of cache
     */
    public int size() {
        return levelExpr.size();
    }

    /**
     * Clears cache.
     */
    public void clear() {
        levelExpr.clear();
    }
}
