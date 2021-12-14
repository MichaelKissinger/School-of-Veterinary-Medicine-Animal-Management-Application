//package com.example.project.controllers;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SearchController {
//
//    @GetMapping("/search/animal")
//    public String getAllAnimals(){
//        return " Animals Information Will Be Display Here!";
//    }
//
//    @GetMapping("/search/animalId/{id}")
//    public String getAnimalById(@PathVariable("id") String id) {
//        return String.format("Information of Animal With ID : %s", id);
//    }
//
//    @GetMapping("/search/animalName/{name}")
//    public String getAnimalByName(@PathVariable("name") String name) {
//        return String.format("Information of Animal with Name : %s", name);
//    }
//
//    @GetMapping("/search/animalBreed/{breed}")
//    public String getAnimalByBreed(@PathVariable("breed") String breed) {
//        return String.format("Information of Animal with Breed : %s", breed);
//    }
//
//    @GetMapping("/search/animalColor/{color}")
//    public String getAnimalByColor(@PathVariable("color") String color) {
//        return String.format("Information of Animal with Color : %s", color);
//    }
//
//    @GetMapping("/search/animalOName/{oName}")
//    public String getAnimalByOwnerName(@PathVariable("oName") String oName) {
//        return String.format("Information of Animal with Owner Name : %s", oName);
//    }
//
//    @GetMapping("/search/animalONumber/{oNumber}")
//    public String getAnimalByOwnerNumber(@PathVariable("oNumber") String oNumber) {
//        return String.format("Information of Animal with Owner last Name : %s", oNumber);
//    }
//
////    we can define all combination of attributes for search animal
//    @GetMapping("/search/animal/{id}/{name}")
//    public String getAnimalByIdAndName(@PathVariable("id") String id, @PathVariable("name") String name) {
//        return "Information of Animal with ID: " + id + ", and Name: " + name;
//    }
//
//    // User Profile
//    @GetMapping("/profile/{userId}")
//    public String getUserProfile(@PathVariable("userId") String userId){
//        return String.format("Profile of User With ID : %s Will be display here", userId);
//    }
//
//    @RequestMapping("/logout/{userId}")
//    public String logout(@PathVariable("userId") String userId){
//        return "User With ID:" + userId + " Logged out.";
//    }
//
//}
