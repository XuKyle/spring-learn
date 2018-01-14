package com.kylexu.chapter4.concert;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    public TrackCounter trackCounter;

    @Autowired
    public Performance performance;

    @Test
    public void testTrackCounter() {
        compactDisc.playTrack(0);
        compactDisc.playTrack(0);
        compactDisc.playTrack(1);
        compactDisc.playTrack(1);
        compactDisc.playTrack(1);

        Assert.assertEquals(2, trackCounter.getTrackCounts(0));
        Assert.assertEquals(3, trackCounter.getTrackCounts(1));
    }

    @Test
    public void testPerformance() {
        Encoreable encoreable = (Encoreable) this.performance;
        encoreable.performEncore();
        this.performance.performance();
    }
}
