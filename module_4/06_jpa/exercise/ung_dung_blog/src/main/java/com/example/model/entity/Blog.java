package com.example.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;
    private String name;
    private String content;

    public Blog(String author, String name, String content) {
        this.author = author;
        this.name = name;
        this.content = content;
    }

    public Blog(Long id, String author, String name, String content) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.content = content;
    }

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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