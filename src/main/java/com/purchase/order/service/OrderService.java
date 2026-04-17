package com.purchase.order.service;

import com.purchase.order.entity.Order;
import com.purchase.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Optional<Order> saveOrder(Order order){
        return Optional.of(repo.save(order));
    }

    public Optional<Order> searchOrder(Integer id){
        return repo.findById(id);
    }
}
