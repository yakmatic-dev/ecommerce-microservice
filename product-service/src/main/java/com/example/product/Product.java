// Placeholder for Product.java
// =============== PRODUCT SERVICE ===============
// File: product-service/src/main/java/com/example/product/Product.java
package com.example.product;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    // Getters and Setters
}
