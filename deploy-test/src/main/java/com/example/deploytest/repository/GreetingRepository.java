package com.example.deploytest.repository;

import com.example.deploytest.dto.GreetingResponse;
import com.example.deploytest.entitiy.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository  extends JpaRepository<Greetings, Integer> {
    Greetings findByLangCode(String langCode);
}
