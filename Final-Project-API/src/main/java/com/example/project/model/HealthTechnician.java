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
    AnimalDatabase animalDatabase;

    /**
     * Health Technician Constructor, creates objects from UserDB, AnimalDB, and list of animals and fills the list from database
     * @param user
     * @throws SQLException
     */
    public HealthTechnician(User user) throws SQLException {
        healthTechnician = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
        animalDatabase = new AnimalDatabase();
    }


    /**
     * Health Technician can change animal status with animal ID
     * @param id
     * @param status
     * @throws SQLException
     */
    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status);
        animalDatabase.initializeDatabase();

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
                jdbcConnect.addAnimalPrescription(drugName, deliveryMethod,
                        userId, date, dosage, instructions,
                        treatmentMethod, Integer.parseInt(animalId));
        }
    }

    /**
     * Health Technician can see the prescription for each animal
     * @param animalId
     */
    public void showPrescribe(int animalId){
        System.out.println(animalDatabase.findAnimal(animalId).getAnimalPrescriptions());
    }
}
