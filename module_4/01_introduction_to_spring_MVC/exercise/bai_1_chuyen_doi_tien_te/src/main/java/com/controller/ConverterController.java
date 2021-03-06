package com.controller;

import com.servie.IConvertService;
import com.servie.impl.ConvertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @Autowired
    ConvertServiceImpl convertService;
    @GetMapping
    public String home(){
        return  "/home";
    }
    @PostMapping(value = "/converter")
    public String convert(@RequestParam String rate , String usd , Model model){
        double result =convertService.convert(Integer.parseInt(rate),Integer.parseInt(usd));
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        model.addAttribute("result",result);

        return "/home";
    }
}
