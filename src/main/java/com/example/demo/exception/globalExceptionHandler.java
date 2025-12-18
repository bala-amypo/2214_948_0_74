package com.example.demo.exception;

import java.util.*;

import org.springframework.http.*;//response entity
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice

public class globalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldEroor(MethodArgumentNotValidException ex){
        Map<String,String> error = new HashMap<>();

        ex.getBindingResult().getFieldError().forEach(err -> error.put(err.getField(),err.getDefaultMessage()));

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }


}