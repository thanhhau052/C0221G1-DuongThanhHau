package com.example.controller;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.service.interface_service.contract_service.IAttachServiceService;
import com.example.model.service.interface_service.contract_service.IContractDetailService;
import com.example.model.service.interface_service.contract_service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/contract-details", "/"})
public class ContractDetailController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IAttachServiceService attachServiceService;
    @Autowired
    private IContractDetailService contractDetailService;


    @ModelAttribute(value = "contracts")
    public Iterable<Contract> contracts() {
        return contractService.findAll();
    }

    @ModelAttribute(value = "attachServices")
    public Iterable<AttachService> attachServices() {
        return attachServiceService.findAll();
    }

    @GetMapping(value = {"/create-contract-detail"})
    public ModelAndView showCreateContractDetail(){
        ContractDetail contractDetail = new ContractDetail();
        ModelAndView modelAndView= new ModelAndView("contract/create-contract-detail");
        modelAndView.addObject("contractDetail", contractDetail);
        return  modelAndView;
    }

    @PostMapping(value = "/create-contract-detail")
    public ModelAndView saveContractDetail(@ModelAttribute("contractDetail") ContractDetail contractDetail){
        contractDetailService.save(contractDetail);
        List<Contract> contracts= (List<Contract>) contractService.findAll();
        List<AttachService> attachServices= (List<AttachService>) attachServiceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/contract/create-contract-detail");
        modelAndView.addObject("contracts",contracts);
        modelAndView.addObject("attachServices",attachServices);
        modelAndView.addObject("mes","new Contract detail created successfully");
        return modelAndView;
    }

}
