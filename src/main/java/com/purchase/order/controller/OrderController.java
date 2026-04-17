package com.purchase.order.controller;

import com.purchase.order.entity.Order;
import com.purchase.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping(value = "/create",consumes = "application/json")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return service.saveOrder(order).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> fetchOrder(@PathVariable Integer id){

        return service.searchOrder(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
