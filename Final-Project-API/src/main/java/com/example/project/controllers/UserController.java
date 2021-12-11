package com.example.project.controllers;

import com.example.project.model.Admin;
import com.example.project.model.TeachingTechnician;
import com.example.project.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class UserController {

    // @RequestMapping("/addUser")
    // public Boolean authentication(@RequestBody HashMap<String, String> userInfo)
    // throws SQLException {

    // String FName = userInfo.get("FName");
    // String LName = userInfo.get("LName");
    // String email = userInfo.get("email");
    // String phoneNumber = userInfo.get("phoneNumber");
    // String permission = userInfo.get("permission");
    // String activatedate = userInfo.get("activatedate");
    // String password = userInfo.get("password");
    // String birthday = userInfo.get("birthday");
    // String gender = userInfo.get("gender");

    // // LoginChecker loginChecker = new LoginChecker(name, password);
    // // User result = loginChecker.checkUsernamePassword();
    // return null;
    // }

    // @GetMapping("/user/{userId}")
    // public String getUser(@PathVariable("userId") String userId){
    // return String.format("Information of User With ID : %s Will be display here",
    // userId);
    // }
    //
    // @GetMapping("/user/{userId}/animals")
    // public String getAllAssignedAnimal(@PathVariable("userId") String userId) {
    // return String.format("Information of All Assigned Animal to User ID : %s",
    // userId);
    // }
    //
    // @GetMapping("/user/{userId}/animalId/{id}")
    // public String getAnimalByIdAssignedToUsedId(@PathVariable("userId") String
    // userId, @PathVariable("id") String id) {
    // return "Information of Animal with ID: " + id + ", Assigned to UsedId: " +
    // userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalType/{type}")
    // public String getAnimalByTypeAssignedToUsedId(@PathVariable("userId") String
    // userId, @PathVariable("type") String type) {
    // return "Information of Animal with Type: " + type + ", Assigned to UsedId: "
    // + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalName/{name}")
    // public String getAnimalByNameAssignedToUsedId(@PathVariable("userId") String
    // userId, @PathVariable("name") String name) {
    // return "Information of Animal with Name: " + name + ", Assigned to UsedId: "
    // + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalBreed/{breed}")
    // public String getAnimalByBreedAssignedToUsedId(@PathVariable("userId") String
    // userId,@PathVariable("breed") String breed) {
    // return "Information of Animal with Breed: " + breed + ", Assigned to UsedId:
    // " + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalColor/{color}")
    // public String getAnimalByColorAssignedToUsedId(@PathVariable("userId") String
    // userId, @PathVariable("color") String color) {
    // return "Information of Animal with Color: " + color + ", Assigned to UsedId:
    // " + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalBirthday/{birthday}")
    // public String getAnimalByBirthdayAssignedToUsedId(@PathVariable("userId")
    // String userId, @PathVariable("birthday") String birthday) {
    // return "Information of Animal with Birthday: " + birthday + ", Assigned to
    // UsedId: " + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalId/{id}/photo")
    // public String getAnimalPhotoByIDAssignedToUsedId(@PathVariable("userId")
    // String userId, @PathVariable("id") String id) {
    // return "Display All Photos for Animal with ID: " + id + ", Assigned to
    // UsedId: " + userId;
    // }
    //
    // @GetMapping("/user/{userId}/animalId/{id}/comments")
    // public String getAnimalCommentsByIDAssignedToUsedId(@PathVariable("userId")
    // String userId, @PathVariable("id") String id) {
    // return "Display All Comments for Animal with ID: " + id + ", Assigned to
    // UsedId: " + userId;
    // }
    //
    // // we can define all combination of attributes for search animal to assigned
    // to user
    // @GetMapping("/user/{userId}/animalId/{id}/{name}")
    // public String getAnimalByIdAndName(@PathVariable("userId") String userId,
    // @PathVariable("id") String id, @PathVariable("name") String name) {
    // return "Information of Animal with ID: " + id + ", and Name: " + name;
    // }
    //
    // // Louout
    // @RequestMapping("/userlogout/{userId}")
    // public String useLogout(@PathVariable("userId") String userId){
    // return "User With ID:" + userId + " Logged out.";
    // }
    //
    // @GetMapping("/search")
    // public String backTosearch(){
    // return " Animals Information Will Be Display Here!";
    // }

}