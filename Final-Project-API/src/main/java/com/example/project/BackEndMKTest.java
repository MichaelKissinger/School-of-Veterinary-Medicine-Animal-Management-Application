package com.example.project;

import com.example.project.model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BackEndMKTest {

    public static void main(String[] args) throws SQLException {
        boolean endApp = false;
        while (endApp == false) {
            Scanner menuSelection2 = new Scanner(System.in);  //Create a Scanner object, for user input
            System.out.println("Would you like to select another animal or exit?");
            System.out.println("1 - Select another animal");
            System.out.println("2 - Exit");
            String option2 = menuSelection2.nextLine();  //Read user input

            switch (option2) {
                case "1":
                    //Testing Animal Search Back end, search by ID
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Please enter Animals ID");
                    String animalID = myObj.nextLine();  // Read user input
                    Animal myAnimal = new Animal(Integer.parseInt(animalID));
                    System.out.println("You are in the animal page for: " + myAnimal.getName() + " with ID: " + myAnimal.getAnimalId());

                    boolean endSelect = false;
                    while (endSelect == false) {
                        Scanner menuSelection = new Scanner(System.in);  //Create a Scanner object, for user input
                        System.out.println("Please type 1 through 14 to select an option from the menu:");
                        System.out.println("1 - View all animal info");
                        System.out.println("2 - View animal status");
                        System.out.println("3 - View prescription info");
                        System.out.println("4 - View problem info");
                        System.out.println("5 - View history info");
                        System.out.println("6 - View photo info");
                        System.out.println("7 - View comment info");
                        System.out.println("8 - Update status");
                        System.out.println("9 - Add new prescription");
                        System.out.println("10 - Add new problem");
                        System.out.println("11 - Add new History");
                        System.out.println("12 - Add new photo");
                        System.out.println("13 - Add new comment");
                        System.out.println("14 - Select another Animal");

                        String option = menuSelection.nextLine();  //Read user input

                        switch (option) {
                            case "1":
                                System.out.println("Showing the info for: " + myAnimal.getName());
                                System.out.println(myAnimal);
                                break;
                            case "2":
                                System.out.println("Showing the status for: " + myAnimal.getName());
                                System.out.println(myAnimal.getStatus());
                                break;
                            case "3":
                                System.out.println("Showing the prescriptions for: " + myAnimal.getName());
                                System.out.println(myAnimal.getAnimalPrescriptions());
                                break;
                            case "4":
                                System.out.println("Showing the problems for: " + myAnimal.getName());
                                System.out.println(myAnimal.getAnimalProblems());
                                break;
                            case "5":
                                System.out.println("Showing the history for: " + myAnimal.getName());
                                System.out.println(myAnimal.getAnimalHistory());
                                break;
                            case "6":
                                System.out.println("Showing the photos for: " + myAnimal.getName());
                                System.out.println(myAnimal.getAnimalHistory().get(0).getAnimalHistoryPhotos());
                                break;
                            case "7":
                                System.out.println("Showing the comments for: " + myAnimal.getName());
                                System.out.println(myAnimal.getAnimalHistory().get(1).getAnimalHistoryComments());
                                break;
                            case "8":
                                System.out.println("Not implemented yet");
                                break;
                            case "9":
                                System.out.println("Not implemented yet1");
                                break;
                            case "10":
                                System.out.println("Not implemented yet2");
                                break;
                            case "11":
                                System.out.println("Not implemented yet3");
                                break;
                            case "12":
                                System.out.println("Not implemented yet4");
                                break;
                            case "13":
                                System.out.println("Not implemented yet5");
                                break;
                            case "14":
                                System.out.println("*** Selecting another Animal *** ");
                                endSelect = true;
                                break;
                                }
                             }
                    break;
                case "2":
                        System.out.println("*** Exiting program *** ");
                        endApp = true;
                        break;
                }
            }
    }
}
