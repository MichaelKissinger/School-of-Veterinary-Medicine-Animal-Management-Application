package com.example.project.controllers;

import com.example.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/requestedlist")
    public ArrayList<Animal> requestedList() throws SQLException {
        CareAttendant careAttendant = new CareAttendant(new User(5, 7788));
        return careAttendant.getRequestedAnimals();
    }

    @GetMapping("/studentList")
    public ArrayList<User> studentArrayList() throws SQLException {
        TeachingTechnician teachingTechnician = new TeachingTechnician(new User(3, 1561));
        System.out.println("12");
        System.out.println(teachingTechnician.getUsers().toString());
        return teachingTechnician.getUsers();
    }

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

        System.out.println(FName);
        System.out.println(LName);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(permission);
        System.out.println(activatedate);
        System.out.println(password);
        System.out.println(birthday);
        System.out.println(gender);

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
