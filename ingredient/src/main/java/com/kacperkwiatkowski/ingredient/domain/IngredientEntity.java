package com.kacperkwiatkowski.ingredient.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity(name = "ingredient")
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String producer;

    // TODO: Apply logic for uploading images and barcodes
//    private byte[] image;
//    private String barcode;

    // TODO: Apply business logic that all elements apply to 100g together
    private int kcal;
    private int protein;
    private int fat;
    private int saturatedFat;
    private int dietaryFiber;
    private int carbohydrates;

    // TODO Include these elements in future
//    private int salt;
//    private int water;
//    private int ethanolAlcohol;
//    private int starch;
//    private int sucrose;
//    private int glucose;
//    private int fructose;
//    private int lactose;
//    private int maltose;
//    private int alcoholicSugars;
//    private int potassium;
//    private int calcium;
//    private int phosphorus;
//    private int magnesium;
//    private int iron;
//    private int zinc;
//    private int copper;
//    private int manganese;
//    private int selenium;
//    private int chloride;
//    private int fluoride;
//    private int iodine;
//    private int vitaminA;
//    private int vitaminB1;
//    private int vitaminB2;
//    private int vitaminB3;
//    private int vitaminB4;
//    private int vitaminB5;
//    private int vitaminB6;
//    private int vitaminB7;
//    private int vitaminB9;
//    private int vitaminB12;
//    private int vitaminC;
//    private int vitaminD;
//    private int vitaminE;
//    private int vitaminK;
//    private int alphaCarotene;
//    private int betaCarotene;
//    private int monounsaturatedFat;
//    private int polyunsaturatedFat;
//    private int cholesterol;
//    private int caffeine;
//    private int glycemicIndex;
}
