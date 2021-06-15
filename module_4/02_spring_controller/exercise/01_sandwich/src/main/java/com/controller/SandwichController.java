package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @RequestMapping("/")
    public String oder() {
        return "/oder";
    }

    @RequestMapping("/save")
    public String save(@RequestParam(name ="condiment") String[] condiment, Model model) {
        String result ="";

        for (int i = 0; i < condiment.length; i++) {
            if (!condiment[i].equals("") && condiment[i] != null) {
                result += condiment[i] + " ";
            }
        }

        if (result.equals(""))
            model.addAttribute("result", " not found ");
        else
            model.addAttribute("result", result);

        return "/result";
    }
}
