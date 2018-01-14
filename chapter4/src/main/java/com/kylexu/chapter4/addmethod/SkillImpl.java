package com.kylexu.chapter4.addmethod;

import org.springframework.stereotype.Component;

@Component
public class SkillImpl implements Skill {
    @Override
    public void getSkill(String skill) {
        System.out.println(skill);
    }
}
