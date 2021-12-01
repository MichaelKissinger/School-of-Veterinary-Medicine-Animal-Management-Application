package com.example.project;

import com.example.project.model.Animal;
import com.example.project.model.AnimalPrescription;
import com.example.project.model.AnimalProblem;
import com.example.project.model.JDBCConnect;
import com.example.project.model.*;
import java.sql.*;
import java.util.Scanner;

public class BackEndAppTester {

    public static void main(String[] args) throws SQLException {


        //Testing updating a status
//        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("What would you like to change the animals status to?");
//        String statusUpdate = myObj.nextLine();  // Read user input
//        myAnimal.setStatus(statusUpdate);
//
//        System.out.println("Here is the updated information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());
//        System.out.println(myAnimal);


//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter user ID");
//        String userID = myObj.nextLine();  // Read user input
//        LoginChecker loginChecker = new LoginChecker();
//        System.out.println("Here is the information for: " + loginChecker.getInfo(Integer.parseInt(userID)));

//        UserDB userDB = new UserDB();
//        System.out.println(userDB.connect());



//        LoginChecker user = new LoginChecker(784512, 7788);
//        user.checkUsernamePassword();
//        user.setUserInfo();
//        System.out.println(user);

        int username = 547896;
        int password = 1212;
        LoginChecker checker = new LoginChecker(username, password);
        checker.checkUsernamePassword();
        if (checker.checkUsernamePassword()) {
            User user = new User(username, password);
            user.setUserInfo();
            System.out.println(user);
        }

    }
}