package com.kacperkwiatkowski.ingredient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
public class Product {

    @Id
    private UUID id;
}
