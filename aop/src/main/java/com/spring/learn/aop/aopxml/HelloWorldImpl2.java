package com.spring.learn.aop.aopxml;

public class HelloWorldImpl2 implements HelloWorld {

    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return;
    }
}
