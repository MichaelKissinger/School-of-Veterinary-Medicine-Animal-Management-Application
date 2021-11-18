package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AnimalProfilesController {

    private Animal animal;

<<<<<<< HEAD
=======
//    public AnimalProfilesController (Animal animal) {
//        this.animal = animal;
//    }

>>>>>>> 1527e4ac53214a88c107c35dbd0d36b4b74f9ac4
    //User profile
    //Log out
    //Back to Search

    //Display Pictures
    //Get
    @GetMapping("/animal/pictures")
    public ArrayList<AnimalPicture> pictures() {
        return animal.getAnimalPictures();
    }

    //Add pictures
    //Post

    //Show animal information
    //Get
    @GetMapping("/animal/information")
    public ArrayList<String> information() {
        return animal.getAnimalInfo();
    }

    //Update Animal Information
    //Put

    //Show animal status
    @GetMapping("/animal/status")
    public ArrayList<AnimalStatus> status() {
        return animal.getAnimalStatuses();
    }

    //Update animal status
    //Put

    //Show animal Treatments
    //Get
    @GetMapping("/animal/treatments")
    public ArrayList<AnimalTreatment> treatments() {
        return animal.getAnimalTreatments();
    }

    //Add animal treatments
    //Post

    //Show comments
    //Get
    @GetMapping("/animal/comments")
    public ArrayList<AnimalComment> comments() {
        return animal.getAnimalComments();
    }

    //Add comments
    //Post




}
