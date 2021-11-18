package com.example.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public String getUser(@PathVariable("userId") String userId){
        return String.format("Information of User With ID : %s Will be display here", userId);
    }

    @GetMapping("/user/{userId}/animals")
    public String getAllAssignedAnimal(@PathVariable("userId") String userId) {
        return String.format("Information of All Assigned Animal to User ID : %s", userId);
    }

    @GetMapping("/user/{userId}/animalId/{id}")
    public String getAnimalByIdAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("id") String id) {
        return "Information of Animal with ID: " + id + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalType/{type}")
    public String getAnimalByTypeAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("type") String type) {
        return "Information of Animal with Type: " + type + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalName/{name}")
    public String getAnimalByNameAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("name") String name) {
        return "Information of Animal with Name: " + name + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalBreed/{breed}")
    public String getAnimalByBreedAssignedToUsedId(@PathVariable("userId") String userId,@PathVariable("breed") String breed) {
        return "Information of Animal with Breed: " + breed + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalColor/{color}")
    public String getAnimalByColorAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("color") String color) {
        return "Information of Animal with Color: " + color + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalBirthday/{birthday}")
    public String getAnimalByBirthdayAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("birthday") String birthday) {
        return "Information of Animal with Birthday: " + birthday + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalId/{id}/photo")
    public String getAnimalPhotoByIDAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("id") String id) {
        return "Display All Photos for Animal with ID: " + id + ", Assigned to UsedId: " + userId;
    }

    @GetMapping("/user/{userId}/animalId/{id}/comments")
    public String getAnimalCommentsByIDAssignedToUsedId(@PathVariable("userId") String userId, @PathVariable("id") String id) {
        return "Display All Comments for Animal with ID: " + id + ", Assigned to UsedId: " + userId;
    }

    //    we can define all combination of attributes for search animal to assigned to user
    @GetMapping("/user/{userId}/animalId/{id}/{name}")
    public String getAnimalByIdAndName(@PathVariable("userId") String userId, @PathVariable("id") String id, @PathVariable("name")  String name) {
        return "Information of Animal with ID: " + id + ", and Name: " + name;
    }

    // Louout
    @RequestMapping("/userlogout/{userId}")
    public String useLogout(@PathVariable("userId") String userId){
        return "User With ID:" + userId + " Logged out.";
    }

    @GetMapping("/search")
    public String backTosearch(){
        return " Animals Information Will Be Display Here!";
    }

}