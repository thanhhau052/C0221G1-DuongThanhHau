package com.example.blog.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String name;
    private String content;


    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id" ,referencedColumnName = "id")
    private Category category;

    public Blog(String author, String name, String content, Category category) {
        this.author = author;
        this.name = name;
        this.content = content;
        this.category = category;
    }

    public Blog(Integer id, String author, String name, String content, Category category) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.content = content;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}