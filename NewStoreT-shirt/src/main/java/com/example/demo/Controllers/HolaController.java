
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    
    @GetMapping("/")
    public String hola(){
    return "Hello Group 2022 - ***New Store T-Shirt Project***";
    }
    
}
