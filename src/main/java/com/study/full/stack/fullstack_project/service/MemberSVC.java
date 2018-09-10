package com.study.full.stack.fullstack_project.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MemberSVC {

    public String test() {
        String msg = "Hello, Spring Boot No AOP";
        log.info(msg);
        return msg;
    }

    public List testAop() {
        List list = new ArrayList();
        String msg = "Hello, Spring Boot AOP";
        list.add(msg);
        msg = "Hello, Spring Boot AOP2";
        list.add(msg);
        msg = "Hello, Spring Boot AOP3";
        list.add(msg);
        msg = "Hello, Spring Boot AOP4";
        list.add(msg);
        for (Object message : list) {
            log.info((String) message);
        }
        return list;
    }

    @Async
    public void method1(String message) throws Exception {
        for (int i = 0; i < 99999; i++) {
            log.info("i=>" + i);
        }
    }

}
