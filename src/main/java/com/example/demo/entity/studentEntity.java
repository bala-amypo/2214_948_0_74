package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
public class studentEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @
    private String name;
    
    @Email(message = "Email Format is Not Valid")
    private String email;

}