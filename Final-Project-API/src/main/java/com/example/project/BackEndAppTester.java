package com.example.project;

import com.example.project.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class BackEndAppTester {

    public static void main(String[] args) throws SQLException {
        //This area is to test the various backend functionality.

        //Testing Animal Search Back end, search by ID
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter Animals ID");
//        String animalID = myObj.nextLine();  // Read user input
//        Animal myAnimal = new Animal(Integer.parseInt(animalID));
//
//        System.out.println("Here is the information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
//        System.out.println(myAnimal);
//
//        //Testing updating a status
//        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("What would you like to change the animals status to?");
//        String statusUpdate = myObj.nextLine();  // Read user input
//        myAnimal.setStatus(statusUpdate);
//
//        System.out.println("Here is the updated information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
//        System.out.println(myAnimal);


//        //Testing Animal Search Back end
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter Animals ID");
//        String animalID = myObj.nextLine();  // Read user input
//
//        Animal myAnimal = new Animal(Integer.parseInt(animalID));
//        System.out.println("Here is the information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
//        System.out.println(myAnimal);
//
//        //Testing updating a status
//        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("What would you like to change the animals status to?");
//        String statusUpdate = myObj.nextLine();  // Read user input
//        myAnimal.setStatus(statusUpdate);
//
//        System.out.println("Here is the updated information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
//        System.out.println(myAnimal);

//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter user ID");
//        String userID = myObj.nextLine();  // Read user input
//        LoginChecker loginChecker = new LoginChecker();
//        System.out.println("Here is the information for: " + loginChecker.getInfo(Integer.parseInt(userID)));

//        UserDB userDB = new UserDB();
//        System.out.println(userDB.connect());

        int username = 442153;
        int password = 3020;
        LoginChecker checker = new LoginChecker(username, password);
        User user = null;
        checker.checkUsernamePassword();
        if (checker.checkUsernamePassword()) {
            user = new User(username, password);
        }

        if (user.getPermission().equals("Admin")) {
            Admin admin = new Admin(user);
//            admin.printUsers();
//            admin.editUser(new User(784513, 8080), "Lname", "aaaa");
//            admin.blockUser(new User(784632, 8585));
//            admin.printAnimal();
//            System.out.println("--------------------------------------------------------------------------");
//            admin.addNewUser("111111", "7777", "Sarraf", "Arman", "40304114587","abc.ucalgary.ca", "m", "1995-12-03", "2016-11-11", "Admin");
//            admin.printUsers();
        }

        if (user.getPermission().equals("Teacher")) {
            TeachingTechnician teachingTechnician = new TeachingTechnician(user);
//            teachingTechnician.printUsers();
//            System.out.println("--------------------------------------------------------------------------");
//            teachingTechnician.blockStudent(new User(442153, 3020));
//            teachingTechnician.printUsers();
//            teachingTechnician.printAnimal();
//            System.out.println(teachingTechnician.searchAnimalByName("Ginger"));
//            System.out.println(teachingTechnician.searchAnimalByID(101));
//            teachingTechnician.requestAnimal(101);
        }


        if (user.getPermission().equals("Student")) {
            Student student = new Student(user);
            student.printAnimal();

        }
    }
}