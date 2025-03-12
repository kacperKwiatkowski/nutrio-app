package com.kacperkwiatkowski.ingredient.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Builder
public class RecipeDTO {

    private String name;
    private String instructions;
    private String comments;
    private List<IngredientDTO> ingredients;
}
