package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Student class is designed to let a student search and view animal profiles and make comments on animal profiles.
 * @author Arman Hosseinsarraf
 */

public class Student {
    ArrayList<Animal> animals;
    User student;
    UserDB userDB;
    JDBCConnect jdbcConnect;

    /**
     * Student Constructor, creates objects from UserDB, AnimalDB, and list of animals and fills the list from database
     *
     * @param user
     * @throws SQLException
     */
    public Student(User user) throws SQLException {
        student = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
        addAnimal();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    /**
     * After each change in the database, the user list will be refreshed
     */
    public void reloadUserDB() throws SQLException {
        animals.clear();
        addAnimal();
    }


    /**
     * Student can search for an animal with the animal name
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public Animal searchAnimalByName(String name) throws SQLException {
        for (Animal animal : animals)
            if (animal.getName().equals(name)) return animal;
        return null;
    }

    /**
     * Student can search for an animal with the animal ID
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Animal searchAnimalByID(int id) throws SQLException {
        for (Animal animal : animals)
            if (animal.getAnimalId() == id) return animal;
        return null;
    }


    public String userName() {
        return student.getFname();
    }

    /**
     * addAnimal() loads the animals from the database and keep them in the animal list.
     */
    public void addAnimal() throws SQLException {
        String animal = (userDB.adminAccessGetAnimal());
        Scanner scanner = new Scanner(animal);
        while (scanner.hasNextLine()) {
            String animalId = scanner.nextLine();

//            animals.add(new Animal(Integer.parseInt(animalId))); // it creates an animal object for each animal id that exist on the database

//            animals.add(new Animal(Integer.parseInt(animalId)));

        }
        scanner.close();
    }


    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println();
        }
    }

    /**
     * Student can add comments for each animal profiles
     * @param recordId
     * @param commentId
     * @param description
     * @throws SQLException
     */
    public void addComment(String recordId, String commentId, String description) throws SQLException {
        jdbcConnect.addAnimalComment(recordId, commentId, description); // comment will be added to the comment history table in database
    }

    /**
     * Student can see animals' comments
     * @param animalId
     */
    public void seeAnimalComment(int animalId) {
        for (Animal ah : animals) {
            if (ah.getAnimalId() == animalId)
                System.out.println(ah.getAnimalHistory());

        }
    }

}

