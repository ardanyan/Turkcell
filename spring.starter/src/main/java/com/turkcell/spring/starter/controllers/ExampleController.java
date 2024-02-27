package com.turkcell.spring.starter.controllers;


import org.apache.catalina.connector.Request;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController {
    @GetMapping
    public String get() {
        return "Hello, World!";
    }
    @PostMapping
    public String post(@RequestBody Request body) {
        return "Hello, from POST!" + body;
    }
}
