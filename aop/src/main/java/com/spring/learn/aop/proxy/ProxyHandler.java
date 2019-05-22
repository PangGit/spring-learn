package com.spring.learn.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理角色
class ProxyHandler implements InvocationHandler {

    private Object tar;

    //绑定委托对象，并返回代理类
    public Object bind(Object tar) {
        this.tar = tar;

        //绑定该类实现的所有接口，取得代理类 
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
        // 通过 Proxy.newProxyInstance 创建的代理对象是在 jvm 运行时动态生成的一个对象，
        // 它并不是我们的InvocationHandler类型，也不是我们定义的那组接口的类型，
        // 而是在运行是动态生成的一个对象，并且命名方式都是这样的形式，
        //  以$开头，proxy为中，最后一个数字表示对象的标号。
    }

    //不依赖具体接口实现
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //被代理的类型为Object基类
        Object result = null;

        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar, args);

        //在调用具体函数方法后，执行功能处理
        return result;
    }
}

