package com.kylexu.springlearn.ch1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch1/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
