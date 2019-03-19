package com.zwm.advice;

import org.springframework.aop.ThrowsAdvice;

import javax.servlet.ServletException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;

public class MyThow implements ThrowsAdvice {
//    public void afterThrowing(Exception ex) throws Throwable {
//        System.out.println("执行异常通知-schema-base方式");
//    }

    public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
        System.out.println("执行异常通知");
    }
}
