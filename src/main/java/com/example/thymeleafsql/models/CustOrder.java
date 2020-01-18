package com.example.thymeleafsql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class CustOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String delivery;

    @ManyToOne
    private Item item;
}
