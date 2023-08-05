package io.thescenery.util;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class MyAspect {
    @Before("execution(* io.thescenery.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("before");
    }

    @After("execution(* io.thescenery.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("after");
    }
}
