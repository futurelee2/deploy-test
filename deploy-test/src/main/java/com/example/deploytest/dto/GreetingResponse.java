package com.example.deploytest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreetingResponse {
    private String lang_code;
    private String message;
}
