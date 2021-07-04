package com.example.model.entity.user;

import com.example.model.entity.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    @OneToMany(targetEntity = Employee.class)
    List<Employee> employees;
}
