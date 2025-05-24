// Placeholder for Order.java
// =============== ORDER SERVICE ===============
// File: order-service/src/main/java/com/example/order/Order.java
package com.example.order;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private BigDecimal total;

    @ElementCollection
    private List<Long> productIds;

    // Getters and Setters
}

