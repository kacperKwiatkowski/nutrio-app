package com.kacperkwiatkowski.ingredient.service;

import com.kacperkwiatkowski.ingredient.dto.RecipeDTO;
import com.kacperkwiatkowski.ingredient.mapper.RecipeMapper;
import com.kacperkwiatkowski.ingredient.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public List<RecipeDTO> getAllRecipes() {
        return recipeMapper.mapEntitiesToDTOs(recipeRepository.findAll());
    }
}
