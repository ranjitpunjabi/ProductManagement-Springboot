package com.learning.ProductSpringbootAndMVC;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
