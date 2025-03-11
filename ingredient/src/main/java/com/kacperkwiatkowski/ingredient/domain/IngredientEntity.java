package com.kacperkwiatkowski.ingredient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity(name = "Ingredient")
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class IngredientEntity {

    @Id
    private UUID id;
    private String name;
    private int weight;
    private int protein;
    private int fat;
    private int carbohydrates;
}
