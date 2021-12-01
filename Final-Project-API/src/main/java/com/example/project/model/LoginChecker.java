package com.example.project.model;

public class LoginChecker {
    UserDB userDB;
    int username;
    int password;
    int flag = -1;

    public LoginChecker(int username, int password) {
        userDB = new UserDB();
        this.username = username;
        this.password = password;
    }

    public boolean checkUsernamePassword() {
        flag = userDB.validateUser(username, password);
        if (flag == 1) return true;
        else
            return false;
    }
}