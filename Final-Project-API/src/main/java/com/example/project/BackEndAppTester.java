package com.example.project;

import com.example.project.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class BackEndAppTester {

    public static void main(String[] args) throws SQLException {
        //This area is to test the various backend functionality.

        int username = 123589;
        int password = 6532;
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
//            teachingTechnician.addComment("9", "4", "Survived");
//            teachingTechnician.seeAnimalComment(103);

        }


        if (user.getPermission().equals("Student")) {
            Student student = new Student(user);
//            student.printAnimal();
//            student.addComment("8", "4", "Survived");
//            student.seeAnimalComment(103);
        }

        if (user.getPermission().equals("Health")) {
            HealthTechnician healthTechnician = new HealthTechnician(user);
//            healthTechnician.printAnimal();
//            healthTechnician.changeAnimalStatus(101, "AAAA");
//            System.out.println("-----------------");
//            healthTechnician.printAnimal();
//            healthTechnician.prescribeForAnimal( "4", "Rutin", "Oral", "456325", "2021-12-08", "20", "Give to the animal once a day with food", "To reduce pain", "101");
//            healthTechnician.showPrescribe(101);
        }

        if (user.getPermission().equals("Care")) {
            CareAttendant careAttendant = new CareAttendant(user);
//            careAttendant.uploadPhoto("10", "1", "Image1", "jpeg");
//            careAttendant.printAnimal();
//            careAttendant.requestTreatment(101);
//            careAttendant.printAnimal();
//            careAttendant.changeAnimalStatus(101, "Healed");
//            careAttendant.printAnimal();
//            careAttendant.alertDiseaseProblem("101", "Blood", "Bondage");
        }
    }
}