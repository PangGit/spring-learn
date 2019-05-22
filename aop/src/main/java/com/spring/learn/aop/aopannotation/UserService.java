package com.spring.learn.aop.aopannotation;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public Object add(){
        System.out.println("UserService add()");
        return "add";
    }

    public boolean delete(){
        System.out.println("UserService delete()");
        return true;
    }

    public void edit(){
        System.out.println("UserService edit()");
        int i = 5/0;
    }


}

