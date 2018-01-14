package com.kylexu.springlearn.ch3.external;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    @Value("#{1}")
    private int x;

    @Value("#{T(System).currentTimeMillis()}")
    private long time;

    @Value("#{systemProperties['disc.title']}")
    private final String title;

    @Value("#{sgtPeppers.artist}")
    private final String artist;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public BlankDisc(@Value("${disc.title}") String title,
                     @Value("disc.artist") String artist) {
        this.title = title;
        this.artist = artist;
    }

}
