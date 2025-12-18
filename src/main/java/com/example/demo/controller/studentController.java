package com.example.demo.controller;

import java.util.List;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid  @RequestBody studentEntity student ){
        return service.addStudent(student);
    }
    
    @GetMapping("/get/{id}")
    public studentEntity getById(@PathVariable Long id){
        return service.getById(id);
        
    }

    @PutMapping("/update/{id}")
    public studentEntity updateById(@PathVariable Long id, @Valid @RequestBody studentEntity newstu){
        return service.updateById(id,newstu);
    }

    @DeleteMapping("delete/{id}")
    public String deleteByID(@PathVariable Long id){
        return service.deleteByID(id);
    }
}