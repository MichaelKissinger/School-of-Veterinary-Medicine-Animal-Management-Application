package com.example.project.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @RequestMapping("/search/animal")
    public String searchAnimal(){
        return " Animal information will be display here!";
    }
}