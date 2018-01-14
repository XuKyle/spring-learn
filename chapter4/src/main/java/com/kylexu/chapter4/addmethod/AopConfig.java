package com.kylexu.chapter4.addmethod;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopConfig {
    @DeclareParents(value = "com.kylexu.chapter4.addmethod.Person+", defaultImpl = SkillImpl.class)
    public Skill skill;
}
