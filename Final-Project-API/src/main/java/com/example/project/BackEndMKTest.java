package com.example.project;

import com.example.project.model.Animal;
import com.example.project.model.AnimalHistory;
import com.example.project.model.AnimalPrescription;
import com.example.project.model.AnimalProblem;

import java.sql.SQLException;
import java.util.Scanner;

public class BackEndMKTest {

    public static void main(String[] args) throws SQLException {
        //This area is to test the various backend functionality.

        //Testing Animal Search Back end, search by ID
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Animals ID");
        String animalID = myObj.nextLine();  // Read user input
        Animal myAnimal = new Animal(Integer.parseInt(animalID));

        System.out.println("Here is the information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());
        System.out.println(myAnimal);

//        System.out.println("Here is the prescription information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());
//        try {
//            AnimalPrescription myPrescripts = new AnimalPrescription(myAnimal.getAnimalId());
//            System.out.println(myPrescripts);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Here is the problem information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());
//        try {
//            AnimalProblem myProblem = new AnimalProblem(myAnimal.getAnimalId());
//            System.out.println(myProblem);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("Here is the history information for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());
        try {
            AnimalHistory myHistory = new AnimalHistory(myAnimal.getAnimalId());
            System.out.println(myHistory);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
