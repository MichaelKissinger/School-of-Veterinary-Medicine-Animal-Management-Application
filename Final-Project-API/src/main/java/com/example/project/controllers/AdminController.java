package com.example.project.controllers;

import com.example.project.model.Admin;
import com.example.project.model.Animal;
import com.example.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@CrossOrigin
@RestController
public class AdminController {
//    String response;

//    @Autowired
//    Admin admin;
//    Animal animal;

    @GetMapping("/allusers")
    public ArrayList<User> userArrayList() throws SQLException {
        Admin admin = new Admin(new User(1, 3333));
        return admin.getUsers();
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


