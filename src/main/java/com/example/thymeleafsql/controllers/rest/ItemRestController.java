package com.example.thymeleafsql.controllers.rest;

import com.example.thymeleafsql.models.Item;
import com.example.thymeleafsql.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemRestController {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemRestController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/all")
    private List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Item> getItemById(@PathVariable Integer id) {
        return itemRepository.findById(id);
    }
}
