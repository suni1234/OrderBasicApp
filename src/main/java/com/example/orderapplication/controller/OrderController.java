package com.example.orderapplication.controller;

import com.example.orderapplication.model.Order;
import com.example.orderapplication.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        return service.createOrder(order);

    }


    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }
}
