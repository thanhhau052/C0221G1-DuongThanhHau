package product.model.service.impl;

import product.model.bean.Product;
import product.model.repository.ProductRepository;
import product.model.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);

    }

    @Override
    public void update(int id, Product product) {
productRepository.update(id,product);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

}