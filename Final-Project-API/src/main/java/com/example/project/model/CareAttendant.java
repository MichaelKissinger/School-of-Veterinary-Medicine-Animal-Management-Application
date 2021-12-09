package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Care Attendant is designed to take photos of animals and upload them, request treatment from technicians, change animals’ status, update daily status and treatment, and alert disease and problems (location).
 * @author Arman Hosseinsarraf
 */
public class CareAttendant {
    ArrayList<Animal> animals;
    User careAtt;
    UserDB userDB;
    JDBCConnect jdbcConnect;

    /**
     * Care Attendants Constructor, creates objects from UserDB, AnimalDB, and list of animals and fills the list from database
     * @param user
     * @throws SQLException
     */
    public CareAttendant(User user) throws SQLException {
        careAtt = user;
        animals = new ArrayList<>();
        userDB = new UserDB();
//        addAnimal();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    /**
     * After each change to animal database, the list of animals will be refreshed
     * @throws SQLException
     */
    public void reloadAnimalDB() throws SQLException {
        animals.clear();
//        addAnimal();
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
        }
        scanner.close();
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

    /**
     * Care Attendant can take and upload photos of each animal to the system.
     * @param recordId
     * @param imageId
     * @param fileName
     * @param type
     * @throws SQLException
     */
    public void uploadPhoto(String recordId, String imageId, String fileName, String type) throws SQLException {
        jdbcConnect.addAnimalPhoto(recordId, imageId, fileName, type); // All the information about animal's pictures will be saved in database
    }


    /**
     * Care Attendant can request for an animal treatment from the technician
     * @param id
     * @throws SQLException
     */
    public void requestTreatment(int id) throws SQLException {
        userDB.updateAnimalStatusToRequested(id);
        animals.clear();
        addAnimal();
    }

//    public void requestTreatment(int id) throws SQLException {
//        userDB.updateAnimalStatusToRequested(id);
//        animals.clear();
//        addAnimal();
//    }


    /**
     * Care Attendant can change animal status
     * @param id
     * @param status
     * @throws SQLException
     */
    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status); // animal status will be changed in the animal database
        reloadAnimalDB();
    }

    /**
     * Care Attendant can alert disease and problems for an animal
     * @param animalId
     * @param disease
     * @param description
     * @throws SQLException
     */
    public void alertDiseaseProblem(String animalId,String disease,String description) throws SQLException {
        jdbcConnect.addAnimalProblem(animalId, disease, description); // new alert and disease will be written into animal database
    }

}
