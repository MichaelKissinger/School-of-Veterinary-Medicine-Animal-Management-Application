package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    ArrayList<Animal> animals;
    User student;
    UserDB userDB;

    public Student(User user) throws SQLException {
        student = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
        addAnimal();
    }

    public void reloadUserDB() throws SQLException {
        animals.clear();
        addAnimal();
    }


    public Animal searchAnimalByName(String name) throws SQLException {
        for (Animal animal : animals)
            if (animal.getName().equals(name)) return animal;
        return null;
    }

    public Animal searchAnimalByID(int id) throws SQLException {
        for (Animal animal : animals)
            if (animal.getAnimalId() == id) return animal;
        return null;
    }


    public String userName() {
        return student.getFname();
    }


    public void addAnimal() throws SQLException {
        String animal = (userDB.adminAccessGetAnimal());
        Scanner scanner = new Scanner(animal);
        while (scanner.hasNextLine()) {
            String animalId = scanner.nextLine();
            animals.add(new Animal(Integer.parseInt(animalId)));
        }
        scanner.close();
    }


    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println();
        }
    }

    public void addComment(Animal animal, String comment){

    }
}

