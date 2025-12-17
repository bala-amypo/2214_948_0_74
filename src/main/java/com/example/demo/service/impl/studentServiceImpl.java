package com.example.demo.service.impl;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class studentServiceImpl implements studentService{

    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll(){
        return repo.findAll();
    }
}