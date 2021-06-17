package com.example.controller;

import com.example.model.bean.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    @GetMapping("/")
    public String getEmail(Model model) {
        model.addAttribute("email", new Email());
        List<String> listLanguages = new ArrayList<>();
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
        model.addAttribute("listLanguages", listLanguages);

        List<Integer> listSize = new ArrayList<>();
        listSize.add(5);
        listSize.add(10);
        listSize.add(15);
        listSize.add(25);
        listSize.add(50);
        listSize.add(100);

        model.addAttribute("listLanguages", listLanguages);
        model.addAttribute("listSize", listSize);
        return "home";
    }
    @PostMapping("/addEmail")
    public String addEmail(@ModelAttribute("email") Email email, Model model) {
        model.addAttribute("email", email);
        return "view";
    }


}
