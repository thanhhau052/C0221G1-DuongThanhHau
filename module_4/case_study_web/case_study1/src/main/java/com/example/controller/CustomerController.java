package com.example.controller;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.service.interface_service.customer_service.ICustomerService;
import com.example.model.service.interface_service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/customers","/"})
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @ModelAttribute(value = "customerTypes")
    public Iterable<CustomerType> customerTypes() {
        return customerTypeService.findAll();
    }

    @GetMapping(value = {"/create-customer"})
    public ModelAndView showCreateCustomer(){
        Customer customer = new Customer();
        ModelAndView modelAndView= new ModelAndView("customer/create");
        modelAndView.addObject("customer", customer);
        return  modelAndView;
    }

    @PostMapping(value = "/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        List<CustomerType> customerTypes= (List<CustomerType>) customerTypeService.findAll();
//        Customer customer1 = new Customer();
        ModelAndView modelAndView = new ModelAndView("/customer/create");
//        modelAndView.addObject("customer",customer1);
        modelAndView.addObject("customerTypes",customerTypes);
        modelAndView.addObject("mes","new customer created successfully");
        return modelAndView;
    }



    @GetMapping(value = "/customers")
    public ModelAndView listCustomer(@RequestParam("search") Optional<String> search, @PageableDefault(value =2 ) Pageable pageable){
        Page<Customer> customers;
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        if(search.isPresent()){
            customers = customerService.findByCustomerNameContaining(search.get(), pageable);
            modelAndView.addObject("search",search.get());
        } else {
            customers = customerService.findAll(pageable);
        }
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping( value = "/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()){
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer",customer.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        List<CustomerType> customerTypes= (List<CustomerType>) customerTypeService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("customerTypes",customerTypes);
        modelAndView.addObject("mes","Customer update successfully");
        return modelAndView;
    }

    @GetMapping(value = "/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id){
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()){
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer",customer.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:customers";
    }

}
