package com.skuggi.apirecipe.controller;

import com.skuggi.apirecipe.domain.models.Recipe;
import com.skuggi.apirecipe.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RecipeController {

    private final RecipeRepository repository;

    @GetMapping("/recipes")
    public List<Recipe> all() {
        return repository.findAll();
    }

    @PostMapping("/recipes")
    public Recipe newRecipe(@RequestBody Recipe recipe) {
        return repository.save(recipe);
    }

    @GetMapping("/recipes/{id}")
    public Recipe getRecipe(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new)
    }


}
