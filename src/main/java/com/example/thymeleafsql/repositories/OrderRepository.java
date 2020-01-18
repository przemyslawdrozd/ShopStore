package com.example.thymeleafsql.repositories;

import com.example.thymeleafsql.models.CustOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<CustOrder, Integer> {
}
