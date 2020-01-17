package com.example.thymeleafsql.repositories;

import com.example.thymeleafsql.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findByNameAndPassword(String name, String password);
}
