package com.example.blog.model.repository;


import com.example.blog.model.entity.Blog;
//import com.example.model.entity.Blog;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    Blog findById(Long id);

    void save(T t);

    void remove(Long id);
}