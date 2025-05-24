// Placeholder for OrderService.java
// File: order-service/src/main/java/com/example/order/OrderService.java
package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepo;

    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    public Order create(Order order) {
        return orderRepo.save(order);
    }
}
