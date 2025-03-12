package com.kacperkwiatkowski.ingredient.service;

import com.kacperkwiatkowski.ingredient.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
}
