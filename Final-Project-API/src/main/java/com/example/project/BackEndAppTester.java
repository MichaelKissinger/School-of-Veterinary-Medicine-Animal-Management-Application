package com.example.project;

import com.example.project.model.Animal;
import com.example.project.model.JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class BackEndAppTester {

    public static void main(String[] args) throws SQLException {
        //This area is to test the various backend functionality.

        //Testing Animal Search Back end
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Animals ID");
        String animalID = myObj.nextLine();  // Read user input

        Animal myAnimal = new Animal(Integer.parseInt(animalID));
        System.out.println("Here is the information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
        System.out.println(myAnimal);

        //Testing updating a status
        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What would you like to change the animals status to?");
        String statusUpdate = myObj.nextLine();  // Read user input
        myAnimal.setStatus(statusUpdate);

        System.out.println("Here is the updated information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalID());
        System.out.println(myAnimal);



    }
}
