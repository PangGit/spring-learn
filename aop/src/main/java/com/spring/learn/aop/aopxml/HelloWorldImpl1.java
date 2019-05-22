package com.spring.learn.aop.aopxml;

public class HelloWorldImpl1 implements HelloWorld {

    public void printHelloWorld() {
        System.out.println("---HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("---HelloWorldImpl1.doPrint()");
        return;
    }
}

