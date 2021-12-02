package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class AnimalProfilesController {

//    private final AnimalService animalService;
//
//    @Autowired
//    public AnimalProfilesController(AnimalService animalService) {
//        this.animalService = animalService;
//    }

    //To be implemented later
//    AnimalProfilesController(Animal animal) {
//        this.animal = animal;
//    }

    //Display Pictures
    @GetMapping("/animal/{animalID}/pictures")
    public /*ArrayList<AnimalPicture>*/ String pictures(@PathVariable("animalID") String animalID) {
//        animal.getAnimalPictures();
        return String.format("Returning Animal Pictures as an ArrayList for animal with %s", animalID);
    }

//    //Add pictures
//    @PostMapping("/animal/{animalID}/pictures")
//    public void addPicture(@RequestBody AnimalPicture newAnimalPicture, @PathVariable("animalID") String animalID) {
////        animal.addAnimalPicture(newAnimalPicture);
//    }

    //Show animal information
//    @GetMapping("/animal/{animalID}/information")
    @GetMapping("/animal/{animalID}/information")
    public String information(@PathVariable("animalID") int animalID) throws SQLException {
        Animal myAnimal = new Animal(animalID);
        return myAnimal.toString();
    }

    //Update Animal Information
    @PutMapping("/animal/{animalID}/information")
    public void updateInformation(@RequestBody String information, @PathVariable("animalID") String animalID) {
//        animal.updateInformation(information);
    }

    //Show animal status
    @GetMapping("/animal/{animalID}/status")
    public /*ArrayList<AnimalStatus>*/ String status(@PathVariable("animalID") String animalID) {
//        animal.getAnimalStatuses();
        return String.format("Returning Animal Status for animal with %s", animalID);
    }

    //Update animal status
//    @PutMapping("/animal/{animalID}/status")
//    public void updateStatus(@RequestBody AnimalStatus newAnimalStatus, @PathVariable("animalID") String animalID) {
////        animal.updateAnimalStatus(newAnimalStatus);
//    }

    //Show animal Treatments
    @GetMapping("/animal/{animalID}/treatments")
    public /*ArrayList<AnimalTreatment>*/ String treatments(@PathVariable("animalID") String animalID) {
//        animal.getAnimalTreatments();
        return String.format("Returning Animal treatments as an ArrayList for animal with %s", animalID);
    }

    //Add animal treatments
//    @PostMapping("/animal/{animalID}/treatments")
//    public void addTreatment(@RequestBody AnimalTreatment newAnimalTreatment, @PathVariable("animalID") String animalID) {
////        animal.addAnimalTreatment(newAnimalTreatment);
//    }

    //Show comments
    @GetMapping("/animal/{animalID}/comments")
    public /*ArrayList<AnimalComment>*/ String comments(@PathVariable("animalID") String animalID) {
//        animal.getAnimalComments();
        return String.format("Returning Animal comments as an ArrayList for animal with %s", animalID);
    }

    //Add comments
//    @PostMapping("/animal/{animalID}/comments")
//    public void addComment(@RequestBody AnimalComment newAnimalComment, @PathVariable("animalID") String animalID) {
////        animal.addAnimalComment(newAnimalComment);
//    }

    //Show prescriptions
    @GetMapping("/animal/{animalID}/prescriptions")
    public /*ArrayList<AnimalPrescription>*/ String prescriptions(@PathVariable("animalID") String animalID) {
//        animal.getAnimalPrescriptions();
        return String.format("Returning Animal prescriptions as an ArrayList for animal with %s", animalID);
    }

    //Add prescription
    @PostMapping("/anima/{animalID}l/prescriptions")
    public void addPrescriptions(@RequestBody AnimalPrescription newAnimalPrescription, @PathVariable("animalID") String animalID) {
//        animal.addAnimalPrescription(newAnimalPrescription);
    }

}
