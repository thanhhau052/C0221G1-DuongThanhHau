package com.example.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String detail;
    private int amount;
    private Date date= new Date();


    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id" ,referencedColumnName = "id")
    private Category category;
    public Product() {
    }

    public Product(Integer id, String name, String detail, int amount, Date date, Category category) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Product(String name, String detail, int amount, Date date, Category category) {
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