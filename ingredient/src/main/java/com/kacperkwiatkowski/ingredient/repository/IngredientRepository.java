package com.kacperkwiatkowski.ingredient.repository;

import com.kacperkwiatkowski.ingredient.domain.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IngredientRepository extends JpaRepository<IngredientEntity, UUID> {


}
