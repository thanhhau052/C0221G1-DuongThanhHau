package model.service;

import model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();



    List<Product> findByName(String name);

    boolean save(Product product);

    boolean update(Product product);

    boolean remove(String  name);
}
