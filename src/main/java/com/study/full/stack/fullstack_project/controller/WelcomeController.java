package com.study.full.stack.fullstack_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        List<Map> users = new ArrayList<Map>();
        Map<String, String> user = new HashMap<>();
        user.put("login", "tony");
        user.put("name", "kim...");
        users.add(user);
        user = new HashMap<>();
        user.put("login", "tony2");
        user.put("name", "kim...2");
        users.add(user);
        user = new HashMap<>();
        user.put("login", "tony3");
        user.put("name", "kim...3");
        users.add(user);

        model.put("message", "hello thymeleaf");
        model.put("users", users);

        return "welcome";
    }

    @RequestMapping("/rest/api/all")
    public Map all(Model model) {
        Map map = new HashMap();
        map.put("name", "tony");
        map.put("phone", "1234");
        return map;
    }

    @RequestMapping("/hello")
    public void hello(Model model) {
        model.addAttribute("name", "hello");
    }

    @RequestMapping("/mypage")
    public View mypage() {
        return new InternalResourceView("/WEB-INF/welcome.html");
    }

    @RequestMapping("/bodyReq")
    @ResponseBody
    public String bodyReq() {
        return "<h1>bodyReq hello </h1>";
    }
}
