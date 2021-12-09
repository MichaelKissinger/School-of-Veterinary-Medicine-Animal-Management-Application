package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CareAttendant {
    ArrayList<Animal> animals;
    User careAtt;
    UserDB userDB;
    JDBCConnect jdbcConnect;

    public CareAttendant(User user) throws SQLException {
        careAtt = user;
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

    public void uploadPhoto(String recordId, String imageId, String fileName, String type) throws SQLException {
        jdbcConnect.addAnimalPhoto(recordId, imageId, fileName, type);
    }

//    public void requestTreatment(int id) throws SQLException {
//        userDB.updateAnimalStatusToRequested(id);
//        animals.clear();
//        addAnimal();
//    }


    public void changeAnimalStatus(int id, String status) throws SQLException {
        userDB.changeAnimalStatus(id, status);
        reloadAnimalDB();
    }

    public void alertDiseaseProblem(String animalId,String disease,String description) throws SQLException {
        jdbcConnect.addAnimalProblem(animalId, disease, description);
    }

}
