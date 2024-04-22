package com.skuggi.apirecipe.domain;

import com.mrrobot.domain.enums.MeasurementUnit;
import com.mrrobot.domain.models.Ingredient;
import com.mrrobot.domain.models.Quantity;
import com.mrrobot.domain.models.Recipe;

public class RecipeFactory {

    private Recipe recipe;

    public static RecipeFactory getInstance() {
        return new RecipeFactory();
    }

    public RecipeFactory createNewRecipe() {
        recipe = new Recipe();
        return this;
    }

    public RecipeFactory setName(String name) {
        recipe.setName(name);
        return this;
    }

    public RecipeFactory addIngredient(String name, float quantity, MeasurementUnit measurementUnit) {
        Ingredient ing = new Ingredient(name);
        Quantity q = new Quantity();
        q.setQuantity(quantity);
        q.setMeasurementUnit(measurementUnit);
        ing.setQuantity(q);
        recipe.addIngredient(ing);
        return this;
    }

    public Recipe build() {
        return recipe;
    }

}
