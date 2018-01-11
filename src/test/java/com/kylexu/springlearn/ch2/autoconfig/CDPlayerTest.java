package com.kylexu.springlearn.ch2.autoconfig;

import com.kylexu.springlearn.ch2.stereo_autoconfig.CDPlayerConfig;
import com.kylexu.springlearn.ch2.stereo_autoconfig.CompactDisc;
import com.kylexu.springlearn.ch2.stereo_autoconfig.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//使用了Spring的SpringJUnit4ClassRunner，以便在测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

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
        //这里判定是错误的，打出来好多日志的东西。。。
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
                log.getLog());
    }

}
