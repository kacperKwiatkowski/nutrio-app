package com.kacperkwiatkowski.ingredient.controller;

import com.kacperkwiatkowski.ingredient.dto.IngredientDTO;
import com.kacperkwiatkowski.ingredient.service.IngredientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class IngredientController {

    private final IngredientService ingredientService;

    @PostMapping("/product")
    public void addProduct(@Valid @RequestBody IngredientDTO productToAdd) {
        ingredientService.addProduct(productToAdd);
    }
}
