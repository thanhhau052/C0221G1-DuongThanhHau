package com.model.service;

import com.model.bean.Product;


import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    List<Product> findByName(String name);
}