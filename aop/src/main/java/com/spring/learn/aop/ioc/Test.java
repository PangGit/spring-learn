package com.spring.learn.aop.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContextIoc.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.say();
    }

}
