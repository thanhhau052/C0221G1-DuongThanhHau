package com.example.controller;


import com.example.model.dto.ServiceDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.service.RentType;
import com.example.model.entity.service.ServiceType;
import com.example.model.entity.service.Services;
import com.example.model.service.interface_service.service_service.IRentTypeService;
import com.example.model.service.interface_service.service_service.IServiceService;
import com.example.model.service.interface_service.service_service.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = {"/services", "/"})
public class ServiceController {
    @Autowired
    private IServiceService serviceService;

    @Autowired
    private IServiceTypeService serviceTypeService;

    @Autowired
    private IRentTypeService rentTypeService;

    @ModelAttribute(value = "serviceTypes")
    public Iterable<ServiceType> serviceTypes() {
        return serviceTypeService.findAll();
    }


    @ModelAttribute(value = "rentTypes")
    public Iterable<RentType> rentTypes() {
        return rentTypeService.findAll();
    }


    @GetMapping(value = {"/create-service"})
    public ModelAndView showCreateService() {
        ServiceDto serviceDto = new ServiceDto();
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("serviceDto", serviceDto);
        return modelAndView;
    }

    @PostMapping(value = "/create-service")
    public ModelAndView saveService(@Validated @ModelAttribute ServiceDto serviceDto, BindingResult bindingResult) {
        Services service = new Services();
        BeanUtils.copyProperties(serviceDto, service);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/service/create");
            modelAndView.addObject("mes", "new service created successfully");
            return  modelAndView;
        }else {
            serviceService.save(service);
            ModelAndView modelAndView = new ModelAndView("/service/create");
            modelAndView.addObject("mes", "new service created successfully");
            return modelAndView;
        }
    }
}
