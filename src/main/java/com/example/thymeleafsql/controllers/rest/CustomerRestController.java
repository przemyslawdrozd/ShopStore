package com.example.thymeleafsql.controllers.rest;

import com.example.thymeleafsql.models.CustOrder;
import com.example.thymeleafsql.models.Customer;
import com.example.thymeleafsql.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        return customerRepository.findById(id);
    }

    @GetMapping("/order/{id}")
    public List<CustOrder> getCustomersByOrderId(@PathVariable Integer id) {

        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(Customer::getOrders).orElse(null);
    }
}
