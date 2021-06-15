package com.controller;

import com.service.ICalculate;
import com.service.impl.CalculateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculatorController {
    @Autowired
    ICalculate calculateService;

    @RequestMapping("/")
    public String home() {
        return "/home";
    }
    @RequestMapping("/calculate")
    public String Calculate(@RequestParam Map<String, String> map,Model model) {
        String num1 = map.get("num1");
        String num2 = map.get("num2");
        String operator = map.get("operator");
        String result= calculateService.calculate(map, operator);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operator", operator);
        return "/home";
    }

    @RequestMapping("/error")
    public  String error(){
        return "/error";
    }
}
