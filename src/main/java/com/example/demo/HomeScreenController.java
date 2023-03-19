package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeScreenController {

    @CrossOrigin
    @GetMapping("/home")
    public ArrayList<Object> homescreen() {
        ArrayList<Object> toReturn = new ArrayList<Object>();
        toReturn.add(new HomeScreen());
        toReturn.add(new Lent());
        toReturn.add(new Fiftydays());

        return toReturn;

    }
}