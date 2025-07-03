package com.ID_6405620.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.ID_6405620.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        
        Object result = joinPoint.proceed();
        
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Executed " + joinPoint.getSignature() + " in " + timeTaken + "ms");
        return result;
    }
}
