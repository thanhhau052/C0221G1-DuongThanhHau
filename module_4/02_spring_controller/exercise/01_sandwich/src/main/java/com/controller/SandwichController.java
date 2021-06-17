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

            model.addAttribute("condiment", condiment);

        return "/result";
    }
}
