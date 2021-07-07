//package com.example.model.entity.user;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  Integer id;
//    private  String roleName;
//    @OneToMany(targetEntity = UserRole11.class)
//    private List<UserRole11> userRoles;
//
//    public Role() {
//    }
//
//    public Role(Integer id, String roleName, List<UserRole11> userRoles) {
//        this.id = id;
//        this.roleName = roleName;
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
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
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
