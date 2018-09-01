package com.study.full.stack.fullstack_project.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
@Slf4j
public class TestAspect {
    @Before("execution(* com.study.full.stack.fullstack_project.service.*.*Aop(..))")
    public void onBeforeHandler(JoinPoint joinPoint) {
        log.info("=================== onBeforeThing");
    }
    @After("execution(* com.study.full.stack.fullstack_project.service.*.*Aop(..))")
    public void onAfterHandler(JoinPoint joinPoint) {
        log.info("=================== onAfterHandler");
    }
    @AfterReturning(pointcut = "execution(* com.study.full.stack.fullstack_project.service.*.*Aop(..))", returning = "str")
    public void onAfterReturningHandler(JoinPoint joinPoint, Object str) {
        List list = (ArrayList) str;
        log.info("@AfterReturning " + list.size());
        log.info("=================== onAfterReturningHandler");
    }
    @Pointcut("execution(* com.study.full.stack.fullstack_project.service.*.*Aop(..))")
    public void onPointCut(JoinPoint joinPoint) {
        log.info("=================== onPointCut");
    }
}
