package com.example.project;

import com.example.project.model.*;

import java.sql.SQLException;
import java.util.ArrayList;

//TODO can be deleted
public class test {

    public static void main(String[] args) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
//        for(Animal a: myDatabase.getAnimals()) {
//            System.out.println(a);
//        }
        JDBCConnect myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        int animalId = 1;
        String disease = "Bad";
        String description = "no good";

        myJDBC.addAnimalComment(animalId, disease);

//        myJDBC.addAnimalProblem(animalId, disease, description);

//        String scriptRecord, String drugName, String deliveryMethod,
//                String userId, String date, String dosage, String instructions,
//                String treatmentMethod, String animalId
//
//        myJDBC.addAnimalPrescription(String scriptRecord, String drugName, String deliveryMethod,
//                String userId, String date, String dosage, String instructions,
//                String treatmentMethod, String animalId)




    }
}
