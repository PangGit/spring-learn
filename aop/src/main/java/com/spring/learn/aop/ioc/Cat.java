package com.spring.learn.aop.ioc;

public class Cat implements Animal {
    private String name;

    @Override
    public void say() {
        System.out.println("I am " + name + "!");
    }

    public void setName(String name) {
        this.name = name;
    }
}