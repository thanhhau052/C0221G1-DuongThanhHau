//package com.example.model.entity.user;
//
//import com.example.model.entity.employee.Employee;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
////@Table(name = "App_User", uniqueConstraints = {@UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name") })
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    private String username;
//    private String password;
//    @OneToMany(targetEntity = Employee.class)
//    List<Employee> employees;
//    @OneToMany(targetEntity = UserRole11.class)
//    private List<UserRole11> userRoles;
//
//    public User() {
//    }
//
//    public User(Integer id, String username, String password, List<Employee> employees, List<UserRole11> userRoles) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.employees = employees;
//        this.userRoles = userRoles;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//
//    public List<UserRole11> getUserRoles() {
//        return userRoles;
//    }
//
//    public void setUserRoles(List<UserRole11> userRoles) {
//        this.userRoles = userRoles;
//    }
//}
