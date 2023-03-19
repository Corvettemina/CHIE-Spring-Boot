package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FiftydaysController {

    @CrossOrigin
    @GetMapping("/50Days")
    public Fiftydays fiftyDays() {

        return new Fiftydays();

    }
}