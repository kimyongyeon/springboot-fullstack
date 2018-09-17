<<<<<<< HEAD
package com.study.full.stack.fullstack_project.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController {
    @RequestMapping("/hi")
    fun hi(): String {
        return "hi kotlin"
    }
=======
package com.study.full.stack.fullstack_project.controller

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HiController {
    @GetMapping("/Hi")
    fun hi(model: Model): String {
        model["title"] = "blog"
        return "blog"
    }
>>>>>>> 7cd31a5e3a00ffe3204f6a8095321fa6c38cf4a3
}