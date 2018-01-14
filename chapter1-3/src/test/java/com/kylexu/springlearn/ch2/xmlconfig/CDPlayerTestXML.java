package com.kylexu.springlearn.ch2.xmlconfig;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ch2/xmlconfig/ConstructorArgCollectionTest-context.xml")
public class CDPlayerTestXML {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void shouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        mediaPlayer.play();
    }
}
