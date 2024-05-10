package com.tech.securityapplication.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) {

        return "Hello World: " + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {

        return "About World: " + request.getSession().getId();
    }
}
