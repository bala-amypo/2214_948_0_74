package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.*;


public interface studentService {

     List<studentEntity> getAll();

     studentEntity addStudent(studentEntity student);

     studentEntity getbyId(Long id);
     
     studentEntity updateById(Long id,studentEntity newstu);

     String deleteByID(Long id);



}