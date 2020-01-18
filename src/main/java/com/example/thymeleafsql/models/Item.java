package com.example.thymeleafsql.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String delivery;

    @ManyToOne
    private CustOrder order;

    public boolean sell(int amount) {
        if (quantity >= amount) {
            this.quantity -= amount;
            return true;
        }
        return false;
    }
}
