package com.example.controller;

import com.example.model.dto.CustomerDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.service.interface_service.customer_service.ICustomerService;
import com.example.model.service.interface_service.customer_service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value = {"/create-customer"})
    public ModelAndView showCreateCustomer() {
        CustomerDto customerDto = new CustomerDto();
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerDto", customerDto);
        return modelAndView;
    }

    @PostMapping(value = "/create-customer")
    public ModelAndView saveCustomer(@Validated @ModelAttribute CustomerDto customerDto, BindingResult bindingResult) {
        List<CustomerType> customerTypes = (List<CustomerType>) customerTypeService.findAll();
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("customer/create");
            modelAndView.addAllObjects(bindingResult.getModel());
            return modelAndView;
        } else {
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("/customer/create");
            modelAndView.addObject("customer", customer);
            modelAndView.addObject("mes", "new customer created successfully");
            return modelAndView;
        }
    }
//    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value = "/customers")
    public ModelAndView listCustomer(@RequestParam("search") Optional<String> search, @PageableDefault(value = 2) Pageable pageable) {
        Page<Customer> customers;
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        customers = customerService.findByCustomerNameContaining(search.orElse(""), pageable);
        modelAndView.addObject("search", search.orElse(""));
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping(value = "/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Customer> customer = customerService.findById(id);

        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer.get(), customerDto);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customerDto", customerDto);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "/edit-customer")
    public ModelAndView updateCustomer(@Validated @ModelAttribute CustomerDto customerDto,
                                       BindingResult bindingResult) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            return modelAndView;
        } else {
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer);
            modelAndView.addObject("mes", "Customer update successfully");
            return modelAndView;
        }

    }

    @GetMapping(value = "/delete-customer")
    public String deleteCustomer(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.get() == null) {
            return "/error";
        }
        customer.get().setFlag(true);
        customerService.save(customer.get());
        redirectAttributes.addFlashAttribute("mes", "deleted successfully! ");
        return "redirect:customers";
    }

}
