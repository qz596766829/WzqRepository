package com.wzq.log.aspect;

import com.wzq.log.annotation.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wzq.log.annotation.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable, InterruptedException {
        System.out.println("=============================");
        Object result = point.proceed();
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        String name = method.getName();
        System.out.println("Method Name:" + name);//输出方法名
        Log log = method.getAnnotation(Log.class);
        System.out.println("Log Value:" + log.value());//输出注解里面的值
        System.out.println("+++++++++++++++++++++++++++++");
        return result;
    }
}