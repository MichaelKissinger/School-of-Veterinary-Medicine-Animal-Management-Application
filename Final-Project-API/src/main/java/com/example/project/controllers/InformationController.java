package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

@CrossOrigin
@RestController
public class InformationController {

    @GetMapping("/allusers")
    public ArrayList<User> userArrayList() throws SQLException {
        Admin admin = new Admin(new User(1, 3333));
        return admin.getUsers();
    }

    @GetMapping("/reqAnimalList")
    public ArrayList<Animal> requestedList() throws SQLException {
        CareAttendant careAttendant = new CareAttendant(new User(5, 7788));
        return careAttendant.getRequestedAnimals();
    }

    @GetMapping("/studentlist")
    public ArrayList<User> studentArrayList() throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        return teachingTechnician.getUsers();
    }

    @GetMapping("/studentblocklist")
    public ArrayList<User> blockedStudentList() throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        return teachingTechnician.getBlocklist();
    }

    @GetMapping("/allusersBlockList")
    public ArrayList<User> blockedUserList() throws SQLException {
        Admin admin = new Admin(new User(1,3333));
        return admin.getBlocklist();
    }


    @PutMapping(
            value = "/removestudent/{userID}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap> removeStudent(@PathVariable("userID") int userID, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        teachingTechnician.removeStudent(userID);
        return null;
    }

    @PutMapping(
            value = "/blockstudent/{userID}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap> blockStudent(@PathVariable("userID") int userID, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        teachingTechnician.blockStudent(userID);
        return null;
    }

    @PutMapping(
            value = "/blockUsers/{UserID}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap> updateStatus(@PathVariable("UserID") int userId, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
        Admin admin = new Admin(new User(1,3333));
        admin.blockUser(userId);
        return null;
    }



//    @RequestMapping(("/admin"))
//    public String display() {
////        admin.displayAdminInfo();
////        admin.displayUsers();
//        response = "Welcome to Admin Page! In this page you have full access to animals, users, ....";
//        return response;
//    }
//
//    @RequestMapping(("/admin/add"))
//    public String add() {
////        admin.addAnimal();
//        response = "Welcome to Admin Page! In this page you add users, ....";
//        return response;
//    }
//
//    @RequestMapping(("/admin/remove"))
//    public String remove() {
////        admin.removeStudent();
//        response = "Welcome to Admin Page! In this page you can remoce users, ....";
//        return response;
//    }
//
//    @RequestMapping(("/admin/block"))
//    public String block() {
////        admin.blockStudent();
//        response = "Welcome to Admin Page! In this page you can block users, ....";
//        return response;
//    }
//
//    @RequestMapping(("/admin/requestAnimal"))
//    public String reqAnimal() {
////        admin.blockStudent();
//        response = "Welcome to Admin Page! In this page you can request for an animal ....";
//        return response;
//    }
    }


