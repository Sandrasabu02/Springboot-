package com.order.Ordered.controller;

import com.order.Ordered.entity.Order;
import com.order.Ordered.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Retrieve all orders
    @GetMapping("")
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    // Retrieve a specific order by ID
    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return orderService.findById(id);
    }

    // Create a new order
    @PostMapping("")
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    // Update an existing order by ID
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        order.setId(id);
        return orderService.save(order);
    }

    // Delete an order by ID
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteById(id);
    }
}
 
