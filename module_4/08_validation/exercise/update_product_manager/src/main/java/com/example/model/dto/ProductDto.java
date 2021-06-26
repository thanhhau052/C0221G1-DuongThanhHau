package com.example.model.dto;

import com.example.model.entity.Category;
import org.hibernate.validator.constraints.Range;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class ProductDto {
    private Integer id;

    @NotBlank
    @Size(min = 5, max = 45, message = "dame")
    private String name;

    @NotBlank
    @Size(min = 5, max = 45, message = "dame")
    private String detail;

    @Range(min = 0, max = 100)
//    @NotBlank
    private int amount;

    private Date date = new Date();

    private Category category;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, String detail, int amount, Date date, Category category) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public ProductDto(String name, String detail, int amount, Date date, Category category) {
        this.name = name;
        this.detail = detail;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
