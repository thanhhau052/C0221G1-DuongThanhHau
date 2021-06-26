package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;


     @OneToMany(targetEntity = Product.class)
    private List<Product> blogs;

    public Category(Integer id, String name, List<Product> blogs) {
        this.id = id;
        this.name = name;
        this.blogs = blogs;
    }

    public Category(String name, List<Product> blogs) {
        this.name = name;
        this.blogs = blogs;
    }

    public Category() {
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

    public List<Product> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Product> blogs) {
        this.blogs = blogs;
    }
}
