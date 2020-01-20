package com.example.thymeleafsql.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CustOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String delivery;
    @OneToMany
    @JoinColumn
    private List<Item> items;
}
