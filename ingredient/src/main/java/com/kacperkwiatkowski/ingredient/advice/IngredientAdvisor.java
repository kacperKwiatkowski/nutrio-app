package com.kacperkwiatkowski.ingredient.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IngredientAdvisor {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> wrongFormatExceptionHandler(NullPointerException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong format");
    }
}
