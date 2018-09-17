package com.study.full.stack.fullstack_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudyController {

    @GetMapping("/study")
    public ModelAndView stduy(Model model) {
//        Map map = new HashMap();
//        map.put("name", "tony");
        model.addAttribute("name", "my attribute");
        return new ModelAndView("study");
    }
}
