package com.skuggi.apirecipe.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private int recipeId;

    @Column(name = "name")
    private String name;

    @Transient
    private List<Ingredient> ingredients;


    public Recipe() {
        ingredients = new LinkedList<>();
    }


    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

}
