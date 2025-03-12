package com.kacperkwiatkowski.ingredient.service;

import com.kacperkwiatkowski.ingredient.dto.IngredientDTO;
import com.kacperkwiatkowski.ingredient.mapper.IngredientMapper;
import com.kacperkwiatkowski.ingredient.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;
    private final IngredientMapper ingredientMapper;

    public void addProduct(IngredientDTO productToAdd) {
        ingredientRepository.save(ingredientMapper.mapDTOToEntity(productToAdd));
    }
}
