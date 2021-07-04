package com.example.controller;


import com.example.model.entity.service.RentType;
import com.example.model.entity.service.ServiceType;
import com.example.model.entity.service.Services;
import com.example.model.service.interface_service.service_service.IRentTypeService;
import com.example.model.service.interface_service.service_service.IServiceService;
import com.example.model.service.interface_service.service_service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        Services service = new Services();
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("service", service);
        return modelAndView;
    }

    @PostMapping(value = "/create-service")
    public ModelAndView saveService(@ModelAttribute("service") Services service) {
        serviceService.save(service);
        List<ServiceType> serviceTypes = (List<ServiceType>) serviceTypeService.findAll();
        List<RentType> rentTypes = (List<RentType>) rentTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("/service/create");
        modelAndView.addObject("serviceTypes", serviceTypes);
        modelAndView.addObject("rentTypes", rentTypes);
        modelAndView.addObject("mes", "new service created successfully");
        return modelAndView;

    }
}
