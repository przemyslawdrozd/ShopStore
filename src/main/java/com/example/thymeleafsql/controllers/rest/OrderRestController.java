package com.example.thymeleafsql.controllers.rest;

import com.example.thymeleafsql.models.CustOrder;
import com.example.thymeleafsql.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    private Optional<CustOrder> getOrderById(@PathVariable Integer id) {
        return orderRepository.findById(id);
    }

}
