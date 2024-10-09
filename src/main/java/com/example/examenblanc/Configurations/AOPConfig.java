package com.example.examenblanc.Configurations;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j //pour utiliser log.info
@Component
@Aspect
public class AOPConfig {
    @After(" execution(* com.example.examenblanc.services.*.*(String))&& args(param) ")
    public void logMethodExit(JoinPoint joinPoint ,String param) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method " + name + " : "  + param);
    }
}
