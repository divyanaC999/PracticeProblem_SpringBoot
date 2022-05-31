package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @RequestMapping ("/hello")
    public ModelAndView sayHello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello.html");
        return modelAndView;
    }
}
