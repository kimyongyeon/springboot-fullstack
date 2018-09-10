package com.study.full.stack.fullstack_project.controller;

import com.study.full.stack.fullstack_project.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public List demo () {
        return demoService.getUserList();
    }

    @RequestMapping("/demoMembers")
    public List getMemberList () {
        return demoService.getMemberList();
    }
}
