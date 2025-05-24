// Placeholder for OrderController.java
// File: order-service/src/main/java/com/example/order/OrderController.java
package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }
}
