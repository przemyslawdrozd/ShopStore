package com.example.thymeleafsql.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Item {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String delivery;
}
