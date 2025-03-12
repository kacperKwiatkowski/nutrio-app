package com.kacperkwiatkowski.ingredient;

import com.kacperkwiatkowski.ingredient.repository.IngredientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class InitialValuesPresenceTests {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Test
    void isDatabasePopulated() {
        // GIVEN

        // WHEN

        // THEN
        assertTrue(ingredientRepository.count() != 0);
    }

}
