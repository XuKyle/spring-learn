package com.kylexu.chapter4.concert;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* com.kylexu.chapter4.concert.Performance.performance(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones!");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seating!");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund!");
    }
}
