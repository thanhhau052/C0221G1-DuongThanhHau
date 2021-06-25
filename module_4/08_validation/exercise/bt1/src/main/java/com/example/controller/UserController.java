package com.example.controller;

import com.example.model.entity.User;
import com.example.model.repository.IUserRepository;
import com.example.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public ModelAndView showForm(){
        return new ModelAndView("/user/list", "user",new User());
    }

    @PostMapping("/user")
    public ModelAndView showResult(@Validated @ModelAttribute User user, BindingResult result){
        if (result.hasFieldErrors()){
            ModelAndView model = new ModelAndView("/user/list");
            model.addAllObjects(result.getModel());
            return model;
        } else {
            userService.save(user);
            ModelAndView model = new ModelAndView("/user/result","user",user);
            return model;
        }
    }
}