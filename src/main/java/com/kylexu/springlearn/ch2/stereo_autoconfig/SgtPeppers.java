package com.kylexu.springlearn.ch2.stereo_autoconfig;

import org.springframework.stereotype.Component;

import javax.inject.Named;

//注解表明该类会作为组件类，并告知Spring要为这个类创建bean
@Component
//Spring会根据类名为其指定一个ID,这个bean所给定的ID为sgtPeppers，也就是将类名的第一个字母变为小写
//@Component("lonelyHeartsClub") 命名bean
//@Named("lonelyHeartsClub") 命名使用Java依赖注入规范（Java Dependency Injection），需要引入javax.inject
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
