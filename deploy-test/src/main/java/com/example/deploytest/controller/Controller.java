package com.example.deploytest.controller;

import com.example.deploytest.dto.GreetingResponse;
import com.example.deploytest.entitiy.Greetings;

import com.example.deploytest.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class Controller {
    private final GreetingService greetingService;

    @GetMapping
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/greeting")
    public GreetingResponse greeting(@RequestParam(name = "lang", defaultValue = "kr") String langCode){
        return greetingService.greeting(langCode);
    }

}
