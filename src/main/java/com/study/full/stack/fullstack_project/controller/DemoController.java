package com.study.full.stack.fullstack_project.controller;

import com.study.full.stack.fullstack_project.service.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoMapper mapper;

    @RequestMapping("/demo")
    public List Demo() {
        return mapper.getUserList();
    }

    @RequestMapping("/demoMembers")
    public List getMembers() {
        return mapper.getMemberList();
    }
}

