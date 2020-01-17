package com.example.thymeleafsql.controllers;

import com.example.thymeleafsql.models.Item;
import com.example.thymeleafsql.services.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/items")
public class ItemController {
    private final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        model.addAttribute("items", itemService.getAll());
        return "items";
    }

    @RequestMapping("/getItem")
    @ResponseBody
    public Optional<Item> getItemById(Integer id) {
        Optional<Item> itemById = itemService.getItemById(id);
        logger.info(itemById.toString());
        return itemById;
    }

    @PostMapping("/addNew")
    public String addNewItem(Item newItem) {
        newItem.setDelivery(LocalDate.now().toString());
        itemService.addNewItem(newItem);
        return "redirect:/items/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Item item) {
        itemService.updateItem(item);
        return "redirect:/items/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteItem(Integer id) {
        itemService.deleteById(id);
        return "redirect:/items/getAll";
    }

    @GetMapping("/getAllCustomerMode")
    public String getAllCustomerMode(Model model) {
        model.addAttribute("items", itemService.getAll());
        return "customer";
    }
}
