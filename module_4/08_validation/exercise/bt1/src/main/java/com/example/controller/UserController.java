package com.example.controller;

import com.example.model.dto.UserDto;
import com.example.model.entity.User;
import com.example.model.repository.IUserRepository;
import com.example.model.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @GetMapping(value = {""})
    public ModelAndView showForm(){
        return new ModelAndView("/user/list", "userDto",new UserDto());
    }

    @PostMapping("/user")
    public ModelAndView showResult(@Validated @ModelAttribute UserDto userDto, BindingResult result){
        // xet validate (loi) cho result
        // xet th minh muon sua lai validate

        new UserDto().validate(userDto,result);
        if (result.hasFieldErrors()){
            ModelAndView model = new ModelAndView("/user/list");
            model.addAllObjects(result.getModel());
            return model;
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            //copy du lieu userDto sang user

            userService.save(user);
            ModelAndView model = new ModelAndView("/user/result","userDto",userDto);
            return model;
        }
    }
}