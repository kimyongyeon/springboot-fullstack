package com.study.full.stack.fullstack_project.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController {
    @RequestMapping("/hi")
    fun hi(): String {
        return "hi kotlin"
    }
}