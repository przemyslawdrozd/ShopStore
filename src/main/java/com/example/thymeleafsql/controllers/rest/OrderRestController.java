package com.example.thymeleafsql.controllers.rest;

import com.example.thymeleafsql.models.CustOrder;
import com.example.thymeleafsql.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderRestController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderRestController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/all")
    private List<CustOrder> getAllOrders() {
        return (List<CustOrder>) orderRepository.findAll();
    }

}
