package com.example.project.controllers;

import com.example.project.model.Animal;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalProfilesController {

    private Animal animal;

    public AnimalProfilesController (Animal animal) {
        this.animal = animal;
    }

    //User profile
    //Log out
    //Back to Search

    //Display Pictures
    //Get
    @GetMapping("/animal/{id}/pictures")
    public String pictures(@PathVariable int id) {
        return animal.getAnimalPictures(id);
    }

    //Add pictures
    //Post

    //Show animal information
    //Get
    @GetMapping("/animal/information")
    public String information(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    //Update Animal Information
    //Put

    //Show animal status
    @GetMapping("/animal/status")
    public String status(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    //Update animal status
    //Put

    //Show animal Treatments
    //Get
    @GetMapping("/animal/treatments")
    public String treatments(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    //Add animal treatments
    //Post

    //Show comments
    //Get
    @GetMapping("/animal/comments")
    public String comments(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    //Add comments
    //Post




}
