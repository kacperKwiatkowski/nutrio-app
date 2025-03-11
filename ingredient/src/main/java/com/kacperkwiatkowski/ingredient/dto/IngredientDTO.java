package com.kacperkwiatkowski.ingredient.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@RequiredArgsConstructor
@Validated
public class IngredientDTO {
    @NotEmpty
    private String name;
    private int weight;
    private int protein;
    private int fat;
    private int carbohydrates;
}
