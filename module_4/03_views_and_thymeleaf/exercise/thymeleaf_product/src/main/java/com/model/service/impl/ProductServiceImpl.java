package com.model.service.impl;

import com.model.bean.Product;
import com.model.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
//    private static int size = 1;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "product1", "detail1", "Viet Nam", 1000));
        products.put(2, new Product(2, "product2", "detail2", "Viet Nam", 2000));
        products.put(3, new Product(3, "product3", "detail3", "Viet Nam", 3000));
        products.put(4, new Product(4, "product4", "detail4", "Viet Nam", 4000));
        products.put(5, new Product(5, "product5 ", "detail5", "Viet Nam", 5000));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        name=name.toLowerCase();
        List<Product> productList = new ArrayList<>();
        List<Product> list = findAll();
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(name)) {
                productList.add(product);
            }

        }
        return productList;
    }
}