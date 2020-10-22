package com.mcd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//@Autowired
//    UserMapperServiceImpl userMapperService;
//
//
//@Test
//    void contextLoads() {
//            ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
//            proxyInvocationHandler.setTarget(userMapperService);
//            UserMapperService proxy = (UserMapperService) proxyInvocationHandler.getProxy();
//            System.out.println(proxy.selUserById(1));
//            }

public class ProxyInvocationHandler implements InvocationHandler {

    //万能公式

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);
        see();

        return result;
    }

    public void see() {
        System.out.println("记录日志");
    }
}
