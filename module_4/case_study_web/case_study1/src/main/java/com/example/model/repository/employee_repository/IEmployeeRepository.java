package com.example.model.repository.employee_repository;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAllByEmployeeNameContaining(String name, Pageable pageable);
    Page<Employee> findAll(Pageable pageable);
}
