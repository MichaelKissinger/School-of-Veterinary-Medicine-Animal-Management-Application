package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AnimalProfilesController {

    private Animal animal;

    //To be implemented later
//    AnimalProfilesController(Animal animal) {
//        this.animal = animal;
//    }

    //Display Pictures
    @GetMapping("/animal/pictures")
    public ArrayList<AnimalPicture> pictures() {
        return animal.getAnimalPictures();
    }

    //Add pictures
    @PostMapping("/animal/pictures")
    public void addPicture(@RequestBody AnimalPicture newAnimalPicture) {
        animal.addAnimalPicture(newAnimalPicture);
    }

    //Show animal information
    @GetMapping("/animal/information")
    public ArrayList<String> information() {
        return animal.getAnimalInfo();
    }

    //Update Animal Information
    @PutMapping("/animal/information")
    public void updateInformation(@RequestBody String information) {
        animal.updateInformation(information);
    }

    //Show animal status
    @GetMapping("/animal/status")
    public ArrayList<AnimalStatus> status() {
        return animal.getAnimalStatuses();
    }

    //Update animal status
    @PutMapping("/animal/status")
    public void updateStatus(@RequestBody AnimalStatus newAnimalStatus) {
        animal.updateAnimalStatus(newAnimalStatus);
    }

    //Show animal Treatments
    @GetMapping("/animal/treatments")
    public ArrayList<AnimalTreatment> treatments() {
        return animal.getAnimalTreatments();
    }

    //Add animal treatments
    @PostMapping("/animal/treatments")
    public void addTreatment(@RequestBody AnimalTreatment newAnimalTreatment) {
        animal.addAnimalTreatment(newAnimalTreatment);
    }

    //Show comments
    @GetMapping("/animal/comments")
    public ArrayList<AnimalComment> comments() {
        return animal.getAnimalComments();
    }

    //Add comments
    @PostMapping("/animal/comments")
    public void addComment(@RequestBody AnimalComment newAnimalComment) {
        animal.addAnimalComment(newAnimalComment);
    }

    //Show prescriptions
    @GetMapping("/animal/prescriptions")
    public ArrayList<AnimalPrescription> prescriptions() {
        return animal.getAnimalPrescriptions();
    }

    //Add prescription
    @PostMapping("/animal/prescriptions")
    public void addPrescriptions(@RequestBody AnimalPrescription newAnimalPrescription) {
        animal.addAnimalPrescription(newAnimalPrescription);
    }

}
