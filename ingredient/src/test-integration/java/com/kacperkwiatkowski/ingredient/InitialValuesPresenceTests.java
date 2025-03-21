package com.kacperkwiatkowski.ingredient;

import com.kacperkwiatkowski.ingredient.repository.IngredientRepository;
import com.kacperkwiatkowski.ingredient.repository.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class InitialValuesPresenceTests {

    @Autowired
    private IngredientRepository ingredientRepository;
    @Autowired
    private RecipeRepository recipeRepository;

    @Test
    void isDatabasePopulated() {
        // GIVEN

        // WHEN

        // THEN
        assertTrue(ingredientRepository.count() != 0);
        assertTrue(recipeRepository.count() != 0);
    }

}
