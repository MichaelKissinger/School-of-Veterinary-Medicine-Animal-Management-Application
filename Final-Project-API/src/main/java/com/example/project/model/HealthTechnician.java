package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class HealthTechnician {
    ArrayList<Animal> animals;
    User healthTechnician;
    UserDB userDB;

    public HealthTechnician(User user) throws SQLException {
        healthTechnician = user;
        animals = new ArrayList<>();

        userDB = new UserDB();

        addAnimal();

    }

    public void reloadAnimalDB() throws SQLException {
        animals.clear();
        addAnimal();
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
            System.out.println("Animal " + a.getName() + " Status: " + a.getStatus());

        }
    }

    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status);
        reloadAnimalDB();
    }

    public void prescribeForAnimal(){
        for (Animal animal : animals) System.out.println(animal.getAnimalPrescriptions());
    }
}
