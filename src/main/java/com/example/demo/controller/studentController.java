package com.example.demo.controller;

import java.util.List;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController {

    @Autowired
    StudentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid  @RequestBody studentEntity student ){
        return service.addStudent(student);
    }
    
}