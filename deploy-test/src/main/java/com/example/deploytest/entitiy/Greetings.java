package com.example.deploytest.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String lang_code;
    String message;
}
