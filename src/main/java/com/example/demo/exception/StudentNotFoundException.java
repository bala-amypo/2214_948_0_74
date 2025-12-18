package com.example.demo.exception;

public class StudentNotFoundException extends RuntimeException{

    StudentNotFoundException(String errMsg){
        super(errMsg);
    }
}
