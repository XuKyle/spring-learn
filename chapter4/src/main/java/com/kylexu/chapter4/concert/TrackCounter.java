package com.kylexu.chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    public int getTrackCounts(int i) {
        return trackCounts.get(i);
    }

    @Pointcut("execution(* com.kylexu.chapter4.concert.CompactDisc.playTrack(..))" + "&&args(trackNumber)")
    public void trackedPlayed(int trackNumber) {
    }

    @Before("com.kylexu.chapter4.concert.TrackCounter.trackedPlayed(trackNumber) ")
    public void countTask(int trackNumber) {
        trackCounts.merge(trackNumber, 1, Integer::sum);
    }
}
