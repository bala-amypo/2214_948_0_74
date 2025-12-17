package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Name is not Valid");
    private String name;

    @Email(message = "Email Format is Not Valid")
    private String email;


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }
    public studentEntity(){ //default constructor

    }

    public studentEntity(Long id,String name,Strong email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
 
}