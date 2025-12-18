package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.studentEntity;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.repository.studentRepo;
import com.example.demo.service.studentService;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    private studentRepo repo;

    @Override
    public List<studentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public studentEntity addStudent(studentEntity student) {
        return repo.save(student);
    }

    @Override
    public studentEntity getbyId(Long id) {
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student ID not Found"));
    }

    @Override
    public studentEntity updateById(Long id, studentEntity newstu) {
        studentEntity existing = getById(id);
        newstu.setId(existing.getId());
        return repo.save(newstu);
    }

    @Override
    public String deleteByID(Long id) {
        studentEntity data = getById(id);
        repo.deleteById(id);
        return "Deleted Successfully!";
    }
}
