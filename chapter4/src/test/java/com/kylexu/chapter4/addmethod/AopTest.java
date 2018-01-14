package com.kylexu.chapter4.addmethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.kylexu.chapter4.addmethod.SpringConfig.class)
public class AopTest {
    @Autowired
    private Student student;

    @Test
    public void test() {
        Skill skill = (Skill) this.student;
        skill.getSkill("我学习Spring");
        student.sayIdentification();
    }
}
