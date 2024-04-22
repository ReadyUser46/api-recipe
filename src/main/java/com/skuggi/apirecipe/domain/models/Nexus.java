package com.skuggi.apirecipe.domain.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "nexus")
public class Nexus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "idr_recipe", referencedColumnName = "id_recipe")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "idr_ingredient", referencedColumnName = "id_ingredient")
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name = "idr_quantity", referencedColumnName = "id_quantity")
    private Quantity quantity;

}