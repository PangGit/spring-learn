package com.spring.learn.aop.proxy;

public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
