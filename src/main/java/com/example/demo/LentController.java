package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LentController {

    @CrossOrigin
    @GetMapping("/Lent")
    public Lent lent() {

        return new Lent();

    }
}