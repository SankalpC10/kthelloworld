package com.example.kthelloworld.kthelloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {
    @GetMapping("springboot")
    fun HelloWorld(): String ="Hello this is a Springboot endpoint"
}