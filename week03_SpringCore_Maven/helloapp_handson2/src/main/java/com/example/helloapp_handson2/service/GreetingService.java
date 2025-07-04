package com.example.helloapp_handson2.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello from the Service Layer!";
    }
}

