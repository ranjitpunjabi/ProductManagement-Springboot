package com.learning.ProductSpringbootAndMVC;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{name}")
    public Product getProducts(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

}
