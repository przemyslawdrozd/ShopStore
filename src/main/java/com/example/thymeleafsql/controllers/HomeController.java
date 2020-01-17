package com.example.thymeleafsql.controllers;

import com.example.thymeleafsql.models.Employee;
import com.example.thymeleafsql.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public HomeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/login")
    public String home(@ModelAttribute(name = "employee")Employee e, Model model) {

        Employee byNameAndPassword = employeeRepository.findByNameAndPassword(e.getName(), e.getPassword());

        if (byNameAndPassword != null) {
            return "redirect:/items/getAll";
        }
        return "index";

    }

    @GetMapping("/enter")
    public String enter() {
        return "redirect:/items/getAll";
    }
}
