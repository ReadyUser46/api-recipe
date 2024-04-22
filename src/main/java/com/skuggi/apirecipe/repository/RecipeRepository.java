package com.skuggi.apirecipe.repository;

import com.skuggi.apirecipe.domain.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
