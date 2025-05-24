// Placeholder for ProductService.java
// File: product-service/src/main/java/com/example/product/ProductService.java
package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public Product create(Product p) {
        return productRepo.save(p);
    }
}
