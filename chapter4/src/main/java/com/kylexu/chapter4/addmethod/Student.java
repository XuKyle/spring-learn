package com.kylexu.chapter4.addmethod;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
    public void sayIdentification() {
        System.out.println("我是学生。");
    }
}
