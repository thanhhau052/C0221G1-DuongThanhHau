package com.controller;

import com.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService dictionaryService;
    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("abc")
    public String exchange(@RequestParam String input, Model model) {

        model.addAttribute("input", input);
        model.addAttribute("result", dictionaryService.translate(input));
        return "/home";
    }
}
