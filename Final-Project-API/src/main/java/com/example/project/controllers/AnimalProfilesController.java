package com.example.project.controllers;

import com.example.project.model.*;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.xml.crypto.Data;

/**
 * Makes API calls for the Animal profile
 * @author Michael Kissinger
 */
@CrossOrigin
@RestController
public class AnimalProfilesController {

    AnimalDatabase myDatabase = new AnimalDatabase();

    public AnimalProfilesController() throws SQLException {
    }

    //All Animals
    @GetMapping("/allAnimals")
    public ArrayList<Animal> getAllAnimals() throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        return myDatabase.getAnimals();
    }

    //Animal Info
    @GetMapping("/animal/{animalID}")
    public Animal getAnimal(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        return myAnimal;
    }

    //Animal Pictures
    @GetMapping("/animal/photos/{animalID}")
    public ArrayList<AnimalHistoryPhotos> getAnimalPhotos(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        ArrayList<AnimalHistoryPhotos> allPhotos = new ArrayList<AnimalHistoryPhotos>();
        for (AnimalHistory h: myAnimal.getAnimalHistory()) {
            ArrayList<AnimalHistoryPhotos> myPhotos = h.getAnimalHistoryPhotos();
            for (AnimalHistoryPhotos c: myPhotos) {
                allPhotos.add(c);
            }
        }
        return allPhotos;
    }

    //Animal Problems
    @GetMapping("/animal/problems/{animalID}")
    public ArrayList<AnimalProblem> getAnimalProblem(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        return myAnimal.getAnimalProblems();
    }

    //Animal Prescriptions
    @GetMapping("/animal/prescriptions/{animalID}")
    public ArrayList<AnimalPrescription> getAnimalPrescriptions(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        return myAnimal.getAnimalPrescriptions();
    }

    //Animal History
    @GetMapping("/animal/history/{animalID}")
    public ArrayList<AnimalHistory> getAnimalHistory(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        return myAnimal.getAnimalHistory();
    }

    //Animal Comments
    @GetMapping("/animal/comments/{animalID}")
    public ArrayList<AnimalHistoryComments> getAnimalComments(@PathVariable("animalID") int animalId) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        ArrayList<AnimalHistoryComments> allComments = new ArrayList<AnimalHistoryComments>();
        for (AnimalHistory h: myAnimal.getAnimalHistory()) {
            ArrayList<AnimalHistoryComments> myComments = h.getAnimalHistoryComments();
            for (AnimalHistoryComments c: myComments) {
                allComments.add(c);
            }
        }
        return allComments;
    }

    @PutMapping(
            value = "/animal/updateStatus/{animalID}",
    consumes = {MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap> updateStatus(@PathVariable("animalID") int animalId, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(animalId);
        myAnimal.updateStatus(animalId, animalStatus.get("Status"));
        System.out.println(animalStatus.get("Status"));
        return null;
    }



//    @GetMapping("/animals")
//    public ArrayList<Animal> getAnimals() throws SQLException {
//        ArrayList<Animal> animalsList = database.getAnimals();
//        return animalsList;
//    }
//

//
//    //Add pictures
//    @PostMapping("/animal/{animalID}/pictures")
//    public void addPicture(@RequestBody AnimalPicture newAnimalPicture, @PathVariable("animalID") String animalID) {
////        animal.addAnimalPicture(newAnimalPicture);
//    }
//
//    //Show animal information
////    @GetMapping("/animal/{animalID}/information")
//    @GetMapping("/animal")
//    public Animal information() throws SQLException {
//        Animal myAnimal = new Animal(101);
//        return myAnimal;
//    }
//
//    //Update Animal Information
//    @PutMapping("/animal/{animalID}/information")
//    public void updateInformation(@RequestBody String information, @PathVariable("animalID") String animalID) {
////        animal.updateInformation(information);
//    }
//
//    //Show animal status
//    @GetMapping("/animal/{animalID}/status")
//    public /*ArrayList<AnimalStatus>*/ String status(@PathVariable("animalID") String animalID) {
////        animal.getAnimalStatuses();
//        return String.format("Returning Animal Status for animal with %s", animalID);
//    }
//
//    //Update animal status
////    @PutMapping("/animal/{animalID}/status")
////    public void updateStatus(@RequestBody AnimalStatus newAnimalStatus, @PathVariable("animalID") String animalID) {
//////        animal.updateAnimalStatus(newAnimalStatus);
////    }
//
//    //Show animal Treatments
//    @GetMapping("/animal/{animalID}/treatments")
//    public /*ArrayList<AnimalTreatment>*/ String treatments(@PathVariable("animalID") String animalID) {
////        animal.getAnimalTreatments();
//        return String.format("Returning Animal treatments as an ArrayList for animal with %s", animalID);
//    }
//
//    //Add animal treatments
////    @PostMapping("/animal/{animalID}/treatments")
////    public void addTreatment(@RequestBody AnimalTreatment newAnimalTreatment, @PathVariable("animalID") String animalID) {
//////        animal.addAnimalTreatment(newAnimalTreatment);
////    }
//
//    //Show comments
//    @GetMapping("/animal/{animalID}/comments")
//    public /*ArrayList<AnimalComment>*/ String comments(@PathVariable("animalID") String animalID) {
////        animal.getAnimalComments();
//        return String.format("Returning Animal comments as an ArrayList for animal with %s", animalID);
//    }
//
//    //Add comments
////    @PostMapping("/animal/{animalID}/comments")
////    public void addComment(@RequestBody AnimalComment newAnimalComment, @PathVariable("animalID") String animalID) {
//////        animal.addAnimalComment(newAnimalComment);
////    }
//
//    //Show prescriptions
//    @GetMapping("/animal/{animalID}/prescriptions")
//    public /*ArrayList<AnimalPrescription>*/ String prescriptions(@PathVariable("animalID") String animalID) {
////        animal.getAnimalPrescriptions();
//        return String.format("Returning Animal prescriptions as an ArrayList for animal with %s", animalID);
//    }
//
//    //Add prescription
//    @PostMapping("/anima/{animalID}l/prescriptions")
//    public void addPrescriptions(@RequestBody AnimalPrescription newAnimalPrescription, @PathVariable("animalID") String animalID) {
////        animal.addAnimalPrescription(newAnimalPrescription);
//    }

}
