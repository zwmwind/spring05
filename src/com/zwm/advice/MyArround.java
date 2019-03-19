package com.zwm.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕-前置");
        Object result = methodInvocation.proceed();
        System.out.println("环绕-后置");
        return result;
    }
}
