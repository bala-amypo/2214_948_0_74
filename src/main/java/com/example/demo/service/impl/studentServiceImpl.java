package com.example.demo.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import com.example.demo.exception.*;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    studentRepo repo;

    public List<studentEntity> getAll() {
        return repo.findAll();
    }

    public studentEntity addStudent(studentEntity student) {
        return repo.save(student);
    }

    public studentEntity getbyId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student ID not Found"));
    }

    public studentEntity updateById(Long id, studentEntity newstu) {
        studentEntity existing = getbyId(id);
        newstu.setId(existing.getId());
        return repo.save(newstu);
    }

    public String deleteByID(Long id) {
        studentEntity data = getbyId(id);
        repo.deleteById(id);
        return "Deleted Successfully!";
    }
}