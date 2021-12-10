package com.example.project.controllers;

import java.sql.SQLException;

import com.example.project.model.UserDB;

import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
public class LoginController {

    private String userName;
    private int response;
    private int pass;

     @RequestMapping("/Login")
     public int authentication() throws SQLException {
     // UserDB userInfo = new UserDB();
     // response = userInfo.validateUser(name, password);
     return 1;
     }

    // @RequestMapping("/login")
    // public int authentication(@RequestParam String name, @RequestParam String
    // password) throws SQLException {
    // // UserDB userInfo = new UserDB();
    // // response = userInfo.validateUser(name, password);
    // return 1;
    // }

//    @GetMapping("/Login")
//    public int authentication() throws SQLException {
//        // UserDB userInfo = new UserDB();
//        // response = userInfo.validateUser(name, password);
////        System.out.println("asd");
//        return 1;
//    }

}




























//package com.example.project.controllers;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class LoginController {
//    private String userName;
//    private String response;
//    private int pass;
//
//    @RequestMapping("/login")
//    public String authentication(){
//        response = "Welcome to Login Page! You should enter your username/password information";
//        return response;
//    }
//
//}
