package com.kacperkwiatkowski.ingredient.mapper;

import com.kacperkwiatkowski.ingredient.domain.IngredientEntity;
import com.kacperkwiatkowski.ingredient.dto.IngredientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class IngredientMapper {

    public IngredientEntity mapToEntity(IngredientDTO ingredientDTO) {
        return IngredientEntity.builder()
                .name(ingredientDTO.getName())
                .protein(ingredientDTO.getProtein())
                .fat(ingredientDTO.getFat())
                .carbohydrates(ingredientDTO.getCarbohydrates())
                .build();
    }
}
