package com.mcd.service.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class LogAspect {
//    @Pointcut(value = "execution(public * com.mcd.service.impl..*.*(..))")

    // 1 找个切点   主要作用是抽取
//    @Pointcut(value = "execution(* com.mcd.service.impl.UserMapperServiceImpl.selUserById(..))")
//    public void suiyi(){}


    @After(value = "execution(* com.mcd.service.impl.UserMapperServiceImpl.selUserById(..))")
    public void beforeMethod() {
        System.out.println("我是日志");
    }

}
