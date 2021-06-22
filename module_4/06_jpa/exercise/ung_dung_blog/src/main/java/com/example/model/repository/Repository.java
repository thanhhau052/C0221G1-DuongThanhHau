package com.example.model.repository;


import com.example.model.entity.Blog;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    Blog findById(Long id);

    void save(T t);

    void remove(Long id);
}