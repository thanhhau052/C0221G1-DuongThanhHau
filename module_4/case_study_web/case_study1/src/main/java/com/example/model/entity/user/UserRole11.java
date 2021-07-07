//package com.example.model.entity.user;
//
//import com.example.model.entity.customer.CustomerType;
//
//import javax.persistence.*;
//
//@Entity
//public class UserRole11 {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private  Integer id;
//    @ManyToOne(targetEntity = User.class)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private  User user;
//    @ManyToOne(targetEntity = Role.class)
//    @JoinColumn(name = "role_id", referencedColumnName = "id")
//    private  Role  role;
//
//    public UserRole11() {
//    }
//
//    public UserRole11(Integer id, User user, Role role) {
//        this.id = id;
//        this.user = user;
//        this.role = role;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//}
