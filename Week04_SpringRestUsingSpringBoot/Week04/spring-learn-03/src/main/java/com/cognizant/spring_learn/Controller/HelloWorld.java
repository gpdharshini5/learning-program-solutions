package com.cognizant.spring_learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-learn")
public class HelloWorld {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }

}
