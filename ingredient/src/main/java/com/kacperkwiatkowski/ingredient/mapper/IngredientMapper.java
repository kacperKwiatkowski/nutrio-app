package com.kacperkwiatkowski.ingredient.mapper;

import com.kacperkwiatkowski.ingredient.domain.IngredientEntity;
import com.kacperkwiatkowski.ingredient.dto.IngredientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class IngredientMapper {

    public IngredientEntity mapToEntity(IngredientDTO ingredientDTO) {
        return IngredientEntity.builder()
                .id(UUID.randomUUID())
                .name(ingredientDTO.getName())
                .weight(ingredientDTO.getWeight())
                .protein(ingredientDTO.getProtein())
                .fat(ingredientDTO.getFat())
                .carbohydrates(ingredientDTO.getCarbohydrates())
                .build();
    }
}
