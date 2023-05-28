package com.learning.ProductSpringbootAndMVC;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public List<Product> getAllProducts(){
        return db.findAll();
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }

    public void addProduct(Product product) {
        db.save(product);
    }

    public void updateProduct(Product product) {
        db.save(product);
    }

    public void deleteProduct(int id) {
        db.deleteById(id);
    }
}
