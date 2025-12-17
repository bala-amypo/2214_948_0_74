package com.example.demo.exception;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.*;

@RestControllerAdvice

public class globalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldEroor(MethodArgumentNotValidException ex){
        Map<String,String> error = new HashMap<>();

        ex.getBindingData().getFieldError().forEach(err -> error.put(ex.getField() , ex.getDefault))
    }


}