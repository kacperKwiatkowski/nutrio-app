package com.kacperkwiatkowski.ingredient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @PostMapping
    public void addRecipe() {

    }
}
