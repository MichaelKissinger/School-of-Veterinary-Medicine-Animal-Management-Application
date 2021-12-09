package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class HealthTechnician {
    ArrayList<Animal> animals;
    User healthTechnician;
    UserDB userDB;
    JDBCConnect jdbcConnect;

    public HealthTechnician(User user) throws SQLException {
        healthTechnician = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
//        addAnimal();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    public void reloadAnimalDB() throws SQLException {
        animals.clear();
//        addAnimal();
    }

//    public void addAnimal() throws SQLException {
//        String animal = (userDB.adminAccessGetAnimal());
//        Scanner scanner = new Scanner(animal);
//        while (scanner.hasNextLine()) {
//            String animalId = scanner.nextLine();
//            animals.add(new Animal(Integer.parseInt(animalId)));
//        }
//        scanner.close();
//    }

    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println("Animal " + a.getName() + " Status: " + a.getStatus());

        }
    }

    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status);
        reloadAnimalDB();
    }

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

    public void showPrescribe(int animalId){
        for (Animal animal: animals){
            if (animal.getAnimalId()==animalId)
                System.out.println(animal.getAnimalPrescriptions());
        }
    }
}
