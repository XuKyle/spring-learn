package com.kylexu.chapter4.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc compactDisc() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("七里香");
        blankDisc.setArtist("Jay");

        List<String> trackList = new ArrayList<>();
        trackList.add("我的地盘");
        trackList.add("七里香");
        trackList.add("借口");
        trackList.add("止战之殇");
        trackList.add("外婆");

        blankDisc.setTracks(trackList);

        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }

    @Bean
    public Performance performance() {
        return new PerformanceImpl();
    }
}
