package product.model.service;

import product.model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
    void update(int id,Product product);
    void remove(int id);



    List<Product> findByName(String name);
}
