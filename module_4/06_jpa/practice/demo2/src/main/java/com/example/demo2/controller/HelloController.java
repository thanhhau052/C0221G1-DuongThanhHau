package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    public  String helloWord(){
        return "/home";
    }
}
