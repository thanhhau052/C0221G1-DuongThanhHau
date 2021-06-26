package com.example.model.dto;



import org.hibernate.validator.constraints.Range;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.validation.constraints.*;

public class UserDto implements Validator {
    private  Long id;

    @NotEmpty(message = "not empty")
    @NotBlank
    @Size(min = 5, max = 45,message = "dame")
    private String  firstName;

    @NotEmpty
    @Size(min = 5, max = 45,message = "dame")
    private String  lastName;

    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{10}", message = "Pls input size must be 10 and style must be integer")
    private  String numberPhone;

    @Pattern(regexp = "^$|[0-9]{2}" , message =  "Pls input age correct format (10 number")
    @Range(min = 18, max = 100)
    private String age;

    @Email
//    @NotEmpty
//    @Pattern(regexp =  "^(.+)@(.+)$", message = "Pls input email correct format. Ex : user@gmail.com")
    private  String email;

    public UserDto(Long id, String firstName, String lastName, String numberPhone, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.age = age;
        this.email = email;
    }

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String numberPhone, String age, String email) {
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



    // method impl
    // xet khi dinh nghia lai regex mac dinh

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto= (UserDto) target;
        if (userDto.email.equals("")){
            errors.rejectValue("email","email.valid");
        }

    }
}
