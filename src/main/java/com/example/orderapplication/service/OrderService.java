package com.example.orderapplication.service;

import com.example.orderapplication.model.Order;
import com.example.orderapplication.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order createOrder(Order order) {

        return repository.save(order);

    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}



