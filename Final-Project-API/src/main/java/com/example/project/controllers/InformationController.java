package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.Console;
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
        Admin admin = new Admin(new User(1, 3333));
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
    public ResponseEntity<HashMap> blockStudent(@PathVariable("userID") String userID, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        if (!userID.equals(""))
            teachingTechnician.blockStudent(Integer.parseInt(userID));
        return null;
    }

    @PutMapping(
            value = "/blockUsers/{userId}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<HashMap> blockUser(@PathVariable("UserID") String userId, @RequestBody HashMap<String, String> animalStatus) throws SQLException {
        Admin admin = new Admin(new User(1, 3333));
        if (!userId.equals(""))
            admin.blockUser(Integer.parseInt(userId));
        return null;
    }

    @RequestMapping("/searchAnimal")
    public ArrayList<Animal> searchAnimal(@RequestBody HashMap<String, String> userInfo) throws SQLException {
        ArrayList<Animal> searchedAnimal = new ArrayList<>();
        AnimalDatabase animalDatabase = new AnimalDatabase();

        String id = userInfo.get("id");
        String name = userInfo.get("name");
        if (!id.equals(""))
            searchedAnimal.add(animalDatabase.findAnimal(Integer.parseInt(id)));
        if (!name.equals(""))
            searchedAnimal = (animalDatabase.findAnimalByName(name));
        return searchedAnimal;
    }

    @RequestMapping("/searchStudent")
    public ArrayList<User> searchStudent(@RequestBody HashMap<String, String> userInfo) throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        Admin admin = new Admin(new User(1, 3333));

        String id = userInfo.get("id");
        String name = userInfo.get("name");
        if (!name.equals("")) {
            users = admin.searchUserByName(name);
        }
        if (!id.equals("")) {
            if (admin.searchUserByid(Integer.parseInt(id)).getPermission().equals("Student"))
                users.add(admin.searchUserByid(Integer.parseInt(id)));
        }

        return users;
    }

    @RequestMapping("/searchUser")
    public ArrayList<User> searchUser(@RequestBody HashMap<String, String> userInfo) throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        Admin admin = new Admin(new User(1, 3333));

        String id = userInfo.get("id");
        String name = userInfo.get("name");


        if (!name.equals("")) {
            users = admin.searchUserByName(name);

        }
        if (!id.equals("")) {
            users.add(admin.searchUserByid(Integer.parseInt(id)));

        }

        return users;
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

    @RequestMapping("/addUser")
    public Boolean addUser(@RequestBody HashMap<String, String> userInfo) throws SQLException {

        String FName = userInfo.get("FName");
        String LName = userInfo.get("LName");
        String email = userInfo.get("email");
        String phoneNumber = userInfo.get("phoneNumber");
        String permission = userInfo.get("permission");
        String activatedate = userInfo.get("activatedate");
        String password = userInfo.get("password");
        String birthday = userInfo.get("birthday");
        String gender = userInfo.get("gender");

        Admin admin = new Admin(new User(1, 3333));
        admin.addNewUser("Active", password, LName, FName, phoneNumber, email,
                gender, birthday, activatedate,
                permission);
        return true;

    }

    @RequestMapping("/addStudent")
    public Boolean addStudent(@RequestBody HashMap<String, String> userInfo) throws SQLException {

        String FName = userInfo.get("FName");
        String LName = userInfo.get("LName");
        String email = userInfo.get("email");
        String phoneNumber = userInfo.get("phoneNumber");
        String permission = userInfo.get("permission");
        String activatedate = userInfo.get("activatedate");
        String password = userInfo.get("password");
        String birthday = userInfo.get("birthday");
        String gender = userInfo.get("gender");

        Admin admin = new Admin(new User(1, 3333));
        admin.addNewUser("Active", password, LName, FName, phoneNumber, email, gender, birthday, activatedate,
                permission);
        return true;
    }

    // @RequestMapping(("/admin"))
    // public String display() {
    //// admin.displayAdminInfo();
    //// admin.displayUsers();
    // response = "Welcome to Admin Page! In this page you have full access to
    // animals, users, ....";
    // return response;
    // }
    //
    // @RequestMapping(("/admin/add"))
    // public String add() {
    //// admin.addAnimal();
    // response = "Welcome to Admin Page! In this page you add users, ....";
    // return response;
    // }
    //
    // @RequestMapping(("/admin/remove"))
    // public String remove() {
    //// admin.removeStudent();
    // response = "Welcome to Admin Page! In this page you can remoce users, ....";
    // return response;
    // }
    //
    // @RequestMapping(("/admin/block"))
    // public String block() {
    //// admin.blockStudent();
    // response = "Welcome to Admin Page! In this page you can block users, ....";
    // return response;
    // }
    //
    // @RequestMapping(("/admin/requestAnimal"))
    // public String reqAnimal() {
    //// admin.blockStudent();
    // response = "Welcome to Admin Page! In this page you can request for an animal
    // ....";
    // return response;
    // }
}
