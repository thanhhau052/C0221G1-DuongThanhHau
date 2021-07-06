package com.example.model.service.interface_service.employee_service;

import com.example.model.entity.employee.Employee;
import com.example.model.service.interface_service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IGeneralService<Employee> {
    Page<Employee> findAllByEmployeeNameContaining(String name, Pageable pageable);
//    Page<Employee> findAll(Pageable pageable);
}
