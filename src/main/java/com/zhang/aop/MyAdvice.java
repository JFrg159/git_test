package com.zhang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(com.zhang.domain.User com.zhang.service.UserService.findById(String))")
    public void pt(){}

    @Around("pt()")
    public Object method(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();

        System.out.println("helloworld      1");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("helloworld         2");
        return proceed;
    }
}
