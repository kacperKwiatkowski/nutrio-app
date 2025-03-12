package com.kacperkwiatkowski.ingredient.mapper;

import com.kacperkwiatkowski.ingredient.domain.RecipeEntity;
import com.kacperkwiatkowski.ingredient.dto.RecipeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class RecipeMapper {

    private final IngredientMapper ingredientMapper;

    public RecipeDTO mapEntityToDTO(RecipeEntity entityToMap){
        return RecipeDTO.builder()
                .name(entityToMap.getName())
                .comments(entityToMap.getComments())
                .instructions(entityToMap.getInstructions())
                .ingredients(entityToMap.getIngredients().stream().map(ingredientMapper::mapEntityToDTO).collect(Collectors.toList()))
                .build();
    }

    public List<RecipeDTO> mapEntitiesToDTOs(List<RecipeEntity> entitiesToMap){
        return entitiesToMap.stream().map(this::mapEntityToDTO).collect(Collectors.toList());
    }
}
