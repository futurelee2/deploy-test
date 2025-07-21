package com.example.deploytest.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String langCode;
    String message;
}
