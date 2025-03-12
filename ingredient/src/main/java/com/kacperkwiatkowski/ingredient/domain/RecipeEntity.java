package com.kacperkwiatkowski.ingredient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "recipe")
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class RecipeEntity {

    @Id
    private UUID id;
    private String name;
    private String instructions;
    private String comments;
    @ManyToMany
    private List<IngredientEntity> ingredients;
}
