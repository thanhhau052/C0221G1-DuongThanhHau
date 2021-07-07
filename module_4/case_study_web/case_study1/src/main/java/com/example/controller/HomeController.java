package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @GetMapping(value = {"/home","/"})
    public String goToHome(){
        return "/home";
    }
    @GetMapping(value = {"/after_home"})
    public String goToAfterHome(){
        return "/after_home";
    }
//    @GetMapping(value = "not_login")
//    public  String goToHomeNotLogin(){
//        return "/not_login.404";
//    }

}
