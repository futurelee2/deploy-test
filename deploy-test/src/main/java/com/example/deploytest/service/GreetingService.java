package com.example.deploytest.service;

import com.example.deploytest.dto.GreetingResponse;
import com.example.deploytest.entitiy.Greetings;
import com.example.deploytest.repository.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingResponse greeting(String langCode) {
         Greetings response = greetingRepository.findByLangCode(langCode);
        return new GreetingResponse(response.getLangCode(),response.getMessage());
    }
}
