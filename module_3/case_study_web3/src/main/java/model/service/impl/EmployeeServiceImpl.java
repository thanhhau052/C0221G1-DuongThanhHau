package model.service.impl;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.repository.EmployeeRepository;
import model.service.IService;

import java.util.List;


public class EmployeeServiceImpl implements  IService<Employee> {
    EmployeeRepository employeeRepository = new EmployeeRepository();


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    public Employee findById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }


    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public boolean save(Employee employee) {
        return employeeRepository.insert(employee);
    }


    public boolean update(int employeeId, Employee employee) {
       return  employeeRepository.update(employeeId,employee);
    }


    public boolean remove(int employeeId) {
        return employeeRepository.delete(employeeId);
    }


    public List<Position> findAllPosition() {
        return employeeRepository.findAllPosition();
    }


    public List<EducationDegree> findAllEducationDegree() {
        return employeeRepository.findAllEducationDegree();
    }


    public List<Division> findAllDivision() {
        return employeeRepository.findAllDivision();
    }
}