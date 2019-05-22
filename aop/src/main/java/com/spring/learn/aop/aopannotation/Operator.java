package com.spring.learn.aop.aopannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Operator {

    @Pointcut("execution(* aopannotation..*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("AOP Before Advice...");
    }

    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("AOP After Advice...");
    }

    @AfterReturning(pointcut = "pointCut()", returning = "returnVal")
    public void afterReturn(JoinPoint joinPoint, Object returnVal) {
        System.out.println("AOP AfterReturning Advice:" + returnVal);
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("AOP AfterThrowing Advice..." + error);
        System.out.println("AfterThrowing...");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("AOP Aronud before...");
        Object object = null;
        System.out.println(pjp.getSignature().getDeclaringType());
        try {
            object = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("AOP Aronud after...");
        return object;
    }




}

