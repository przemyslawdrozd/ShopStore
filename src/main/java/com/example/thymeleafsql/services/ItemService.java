package com.example.thymeleafsql.services;

import com.example.thymeleafsql.models.Item;
import com.example.thymeleafsql.repositories.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private final Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAll() {
        return (List<Item>) itemRepository.findAll();
    }

    public Optional<Item> getItemById(Integer id) {
        return itemRepository.findById(id);
    }

    public void addNewItem(Item newItem) {
        itemRepository.save(newItem);
    }

    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    public void deleteById(Integer id) {
        itemRepository.deleteById(id);
    }
}
