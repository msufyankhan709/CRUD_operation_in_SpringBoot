package com.demo.my_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class first {
    @GetMapping("/welcome")

    public String welcome(){
        return "Welcome to My First App";
    }
    
}
