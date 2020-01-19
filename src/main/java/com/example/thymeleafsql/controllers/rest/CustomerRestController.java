package com.example.thymeleafsql.controllers.rest;

import com.example.thymeleafsql.models.Customer;
import com.example.thymeleafsql.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/all")
    private List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}
