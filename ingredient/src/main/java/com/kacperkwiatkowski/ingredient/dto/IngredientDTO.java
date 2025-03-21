package com.kacperkwiatkowski.ingredient.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Builder
public class IngredientDTO {
    @NotEmpty
    private String name;
    private int weight;
    private int protein;
    private int fat;
    private int carbohydrates;
}
