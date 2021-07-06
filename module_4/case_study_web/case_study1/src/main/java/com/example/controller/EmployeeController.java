package com.example.controller;

import com.example.model.dto.EmployeeDto;
import com.example.model.entity.customer.Customer;
import com.example.model.entity.customer.CustomerType;
import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EducationDegree;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.Position;
import com.example.model.service.interface_service.employee_service.IDivisionService;
import com.example.model.service.interface_service.employee_service.IEducationService;
import com.example.model.service.interface_service.employee_service.IEmployeeService;
import com.example.model.service.interface_service.employee_service.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/employee", "/"})
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IPositionService positionService;
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IEducationService educationService;


    @ModelAttribute(value = "divisions")
    public Iterable<Division> divisions() {
        return divisionService.findAll();
    }

    @ModelAttribute(value = "educationDegrees")
    public Iterable<EducationDegree> educationDegrees() {
        return educationService.findAll();
    }

    @ModelAttribute(value = "positions")
    public Iterable<Position> positions() {
        return positionService.findAll();
    }

    // tao moi
    @GetMapping(value = {"/create-employee"})
    public ModelAndView showCreateEmployee() {
        EmployeeDto employeeDto = new EmployeeDto();
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employeeDto", employeeDto);
        return modelAndView;
    }

    @PostMapping(value = "/create-employee")
    public ModelAndView saveCEmployee(@Validated @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult) {

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);

        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/employee/create");
            modelAndView.addObject(bindingResult.getModel());
            return modelAndView;
        } else {
            employeeService.save(employee);
            ModelAndView modelAndView = new ModelAndView("/employee/create");
            modelAndView.addObject("employee", employee);
            modelAndView.addObject("mes", "new employee created successfully");
            return modelAndView;
        }

    }

    @GetMapping(value = "/employees")
    public ModelAndView listEmployee(@RequestParam("search") Optional<String> search, @PageableDefault(value = 2) Pageable pageable) {
        Page<Employee> employees;
        ModelAndView modelAndView = new ModelAndView("/employee/list");
        employees = employeeService.findAllByEmployeeNameContaining(search.orElse(""), pageable);
        modelAndView.addObject("search", search.orElse(""));
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping(value = "/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.findById(id);
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee.get(), employeeDto);
        if (employee.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("employeeDto", employeeDto);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }
    @PostMapping(value = "/edit-employee")
    public ModelAndView updateEmployee(@Validated @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult) {
        Employee employee = new Employee();

        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("employee/edit");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            employeeService.save(employee);
            ModelAndView modelAndView = new ModelAndView("employee/edit");
            modelAndView.addObject("employee", employee);
            modelAndView.addObject("mes", "Employee update successfully");
            return modelAndView;
        }

    }

    @GetMapping(value = "/delete-employee")
    public String deleteEmployee(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee.get() == null) {
            return "/error";
        }
        employee.get().setFlag(true);
        employeeService.save(employee.get());
        redirectAttributes.addFlashAttribute("mes", "deleted successfully! ");
        return "redirect:employees";
    }

}
