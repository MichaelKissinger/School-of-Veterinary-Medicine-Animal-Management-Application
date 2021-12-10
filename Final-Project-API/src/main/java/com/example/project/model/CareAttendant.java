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
     * Care Attendant can take and upload photos of each animal to the system.
     * @param recordId
     * @param fileName
     * @param type
     * @throws SQLException
     */
    public void uploadPhoto(String recordId, String fileName, String type) throws SQLException {
        jdbcConnect.addAnimalPhoto(recordId, fileName, type); // All the information about animal's pictures will be saved in database
    }


    /**
     * Care Attendant can request for an animal treatment from the technician
     * @param id
     * @throws SQLException
     */
    public void requestTreatment(int id) throws SQLException {
        userDB.updateAnimalStatusToRequested(id);

    }


    /**
     * Care Attendant can change animal status
     * @param id
     * @param status
     * @throws SQLException
     */
    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status); // animal status will be changed in the animal database
    }

    /**
     * Care Attendant can alert disease and problems for an animal
     * @param animalId
     * @param disease
     * @param description
     * @throws SQLException
     */
    public void alertDiseaseProblem(String animalId,String disease,String description) throws SQLException {
//        jdbcConnect.addAnimalProblem(animalId, disease, description); // new alert and disease will be written into animal database
    }

}
