package com.example.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private String userName;
    private String response;
    private int pass;

    @RequestMapping("/login")
    public String authentication(){
        response = "Welcome to Login Page! You should enter your username/password information";
        return response;
    }


}
