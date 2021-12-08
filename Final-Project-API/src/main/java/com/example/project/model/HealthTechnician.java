package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Health Technician can diagnose and prescribe for them, change animals’ status, and monitor animal status in this system
 * * @author Arman Hosseinsarraf
 */
public class HealthTechnician {
    ArrayList<Animal> animals;
    User healthTechnician;
    UserDB userDB;
    JDBCConnect jdbcConnect;

    /**
     * Health Technician Constructor, creates objects from UserDB, AnimalDB, and list of animals and fills the list from database
     * @param user
     * @throws SQLException
     */
    public HealthTechnician(User user) throws SQLException {
        healthTechnician = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
        addAnimal();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    /**
     * After each change in the database, the animal list will be refreshed
     */
    public void reloadAnimalDB() throws SQLException {
        animals.clear();
        addAnimal();
    }

    /**
     * addAnimal() loads the animals from the database and keep them in the animal list.
     */
    public void addAnimal() throws SQLException {
        String animal = (userDB.adminAccessGetAnimal());
        Scanner scanner = new Scanner(animal);
        while (scanner.hasNextLine()) {
            String animalId = scanner.nextLine();
            animals.add(new Animal(Integer.parseInt(animalId))); // it creates an animal object for each animal id that exist on the database
        }
        scanner.close();
    }


    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println("Animal " + a.getName() + " Status: " + a.getStatus());

        }
    }

    /**
     * Health Technician can change animal status with animal ID
     * @param id
     * @param status
     * @throws SQLException
     */
    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status);
        reloadAnimalDB();
    }

    /**
     * Health Technician can prescribe for animals
     * @param scriptRecord
     * @param drugName
     * @param deliveryMethod
     * @param userId
     * @param date
     * @param dosage
     * @param instructions
     * @param treatmentMethod
     * @param animalId
     * @throws SQLException
     */
    public void prescribeForAnimal(String scriptRecord, String drugName, String deliveryMethod,
                                   String userId, String date, String dosage, String instructions,
                                   String treatmentMethod, String animalId) throws SQLException {
        for (Animal animal: animals){
            if (animal.getAnimalId()==Integer.parseInt(animalId))
                jdbcConnect.addAnimalPrescription(scriptRecord, drugName, deliveryMethod,
                        userId, date, dosage, instructions,
                        treatmentMethod, animalId);
        }
    }

    /**
     * Health Technician can see the prescription for each animal
     * @param animalId
     */
    public void showPrescribe(int animalId){
        for (Animal animal: animals){
            if (animal.getAnimalId()==animalId)
                System.out.println(animal.getAnimalPrescriptions());
        }
    }
}
