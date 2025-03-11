package com.kacperkwiatkowski.ingredient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
public class ProductEntity {

    @Id
    private UUID id;
}
