package com.example.controller;

import com.example.model.dto.ContractDto;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.service.Services;
import com.example.model.service.interface_service.contract_service.IContractService;
import com.example.model.service.interface_service.customer_service.ICustomerService;
import com.example.model.service.interface_service.employee_service.IEmployeeService;
import com.example.model.service.interface_service.service_service.IServiceService;
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
@RequestMapping(value = {"/contracts","/"})
public class ContractController {

    @Autowired
    private IContractService contractService;

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IServiceService serviceService;


    @ModelAttribute(value = "customers")
    public Iterable<Customer> customers() {
        return customerService.findAll();
    }

    @ModelAttribute(value = "employees")
    public Iterable<Employee> employees() {
        return employeeService.findAll();
    }

    @ModelAttribute(value = "services")
    public Iterable<Services> services() {
        return serviceService.findAll();
    }

    @GetMapping(value = {"/create-contract"})
    public ModelAndView showCreateContract() {
        ContractDto contractDto = new ContractDto();
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("contractDto", contractDto);
        return modelAndView;
    }

    @PostMapping(value = "/create-contract")
    public ModelAndView saveContract(@Validated @ModelAttribute ContractDto contractDto, BindingResult bindingResult) {
        List<Customer> customers = (List<Customer>) customerService.findAll();
        List<Employee> employees = (List<Employee>) employeeService.findAll();
        List<Services> services = (List<Services>) serviceService.findAll();
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto, contract);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/contract/create");
            modelAndView.addObject("customers", customers);
            modelAndView.addObject("employees", employees);
            modelAndView.addObject("services", services);
            return modelAndView;
        } else {

            contractService.save(contract);
            ModelAndView modelAndView = new ModelAndView("/contract/create");
            modelAndView.addObject("customers", customers);
            modelAndView.addObject("employees", employees);
            modelAndView.addObject("services", services);
            modelAndView.addObject("mes", "new employee created successfully");
            return modelAndView;
        }

    }
}