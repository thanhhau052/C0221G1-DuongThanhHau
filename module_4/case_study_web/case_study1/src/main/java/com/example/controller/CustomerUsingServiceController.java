package com.example.controller;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.service.Services;
import com.example.model.service.interface_service.contract_service.IAttachServiceService;
import com.example.model.service.interface_service.contract_service.IContractService;
import com.example.model.service.interface_service.service_service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/using-service")
public class CustomerUsingServiceController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IServiceService serviceService;
    @Autowired
    private IAttachServiceService attachServiceService;

    @GetMapping(value = "/")
    public ModelAndView goToCustomerUsing(@RequestParam Optional<String> name, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer_using/list");
        List<AttachService> attachServices = (List<AttachService>) attachServiceService.findAll();
        String nameValue = "";
        if (name.isPresent()) {
            nameValue = name.get();
        }
        Page<Contract> contracts = contractService.findAllCustomerName(nameValue, pageable);
        modelAndView.addObject("attachServices", attachServices);
        modelAndView.addObject("contracts", contracts);
        return modelAndView;
    }

    @GetMapping(value = "/edit-contract/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Contract> contract = contractService.findById(id);
        List<Services> services= (List<Services>) serviceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/contract/edit");

        modelAndView.addObject("contract", contract.get());
        modelAndView.addObject("services", services);
        return modelAndView;

    }

    @PostMapping(value = "/edit-contract")
    public ModelAndView updateContract(@Validated @ModelAttribute Contract contract) {
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("contract/edit");
        modelAndView.addObject("contract", contract);
        modelAndView.addObject("mes", "contract update successfully");
        return modelAndView;


    }
}