package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.example.demo.entity.*;
import com.example.demo.service.*;


@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        return service.getAll();

    }

    @PostMaping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student ){
        return service.add
    }
}