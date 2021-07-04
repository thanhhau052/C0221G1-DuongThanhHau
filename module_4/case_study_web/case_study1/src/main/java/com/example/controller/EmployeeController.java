package com.example.controller;
import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EducationDegree;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.Position;
import com.example.model.service.interface_service.employee_service.IDivisionService;
import com.example.model.service.interface_service.employee_service.IEducationService;
import com.example.model.service.interface_service.employee_service.IEmployeeService;
import com.example.model.service.interface_service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping(value = {"/employee","/"})
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
    public ModelAndView showCreateEmployee(){
        Employee employee = new Employee();
        ModelAndView modelAndView= new ModelAndView("employee/create");
        modelAndView.addObject("employee", employee);
        return  modelAndView;
    }

    @PostMapping(value = "/create-employee")
    public ModelAndView saveCEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        List<Division> divisions= (List<Division>) divisionService.findAll();
        List<EducationDegree> educationDegrees= (List<EducationDegree>) educationService.findAll();
        List<Position> positions= (List<Position>) positionService.findAll();
        ModelAndView modelAndView = new ModelAndView("/employee/create");

        modelAndView.addObject("divisions",divisions);
        modelAndView.addObject("educationDegrees",educationDegrees);
        modelAndView.addObject("positions",positions);
        modelAndView.addObject("mes","new customer created successfully");
        return modelAndView;
    }

}
