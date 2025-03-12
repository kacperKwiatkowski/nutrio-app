package com.kacperkwiatkowski.ingredient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotEmpty;
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
    @NotEmpty
    private String name;
    private String instructions;
    private String comments;
    @NotEmpty
    @ManyToMany
    private List<IngredientEntity> ingredients;
}
