package com.kylexu.chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAround {
    @Pointcut("execution(* com.kylexu.chapter4.concert.Performance.performance(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silencing cell Phones!");
            System.out.println("Taking Seats");
            joinPoint.proceed();
            System.out.println("Clap Clap Clap!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund!");
        }
    }


}
