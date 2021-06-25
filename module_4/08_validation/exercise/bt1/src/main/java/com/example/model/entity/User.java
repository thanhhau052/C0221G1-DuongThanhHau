package com.example.model.entity;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String  firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String  lastName;

    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{10}", message = "Pls input size must be 10 and style must be integer")
    private  String numberPhone;

    @Pattern(regexp = "^$|[0-9]{2}" , message =  "Pls input age correct format (10 number")
    @Range(min = 18, max = 100)
    private String age;

    @NotEmpty
    @Pattern(regexp =  "^(.+)@(.+)$", message = "Pls input email correct format. Ex : user@gmail.com")
    private  String email;

    public User(Long id, String firstName, String lastName, String numberPhone, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.email = email;
    }

    public User() {
    }

    public User(String firstName, String lastName, String numberPhone, String age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
