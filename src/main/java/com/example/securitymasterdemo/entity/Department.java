package com.example.securitymasterdemo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}