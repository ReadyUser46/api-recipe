package com.skuggi.apirecipe.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredient")
    private int ingredientId;

    @Column(name = "name")
    private String name;

    @Transient
    private Quantity quantity;


    public Ingredient(String name) {
        this.name = name;
    }

}
