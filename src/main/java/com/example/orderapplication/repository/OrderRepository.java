package com.example.orderapplication.repository;

import com.example.orderapplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
