package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    //    @GetMapping("/hello")
//    @RequestMapping(method = RequestMethod.GET)
    @RequestMapping("/suraj")
    public String sayHello() {
        return "hello";
    }
}