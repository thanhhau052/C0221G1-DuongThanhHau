package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculatorController {
    @RequestMapping("/")
    public String home() {
        return "/home";
    }

    @RequestMapping("/calculate")
    public String Calculate(@RequestParam Map<String, String> map, Model model) {
        float num1 = Float.parseFloat(map.get("num1"));
        float num2 = Float.parseFloat(map.get("num2"));
        String operator = map.get("operator");

//        System.out.println(num1);
//        System.out.println(operator);

        String result="";
        switch (operator) {
            case "+":
                result =  Float.toString(num1+num2);
                operator="+";
                break;
            case "-":
                result =  Float.toString(num1-num2);
                operator="-";
                break;
            case "*":
                result =  Float.toString(num1*num2);
                operator="*";
                break;
            case "/":
                result =  Float.toString(num1/num2);
                operator="/";
                break;
            default:
                break;
        }

        model.addAttribute("result",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("operator",operator);
        return "/home";
    }
}
