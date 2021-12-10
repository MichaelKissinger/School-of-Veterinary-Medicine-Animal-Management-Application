package com.example.project;

import com.example.project.model.Animal;
import com.example.project.model.AnimalDatabase;
import com.example.project.model.AnimalHistory;
import com.example.project.model.AnimalHistoryComments;

import java.sql.SQLException;
import java.util.ArrayList;

//TODO can be deleted
public class test {

    public static void main(String[] args) throws SQLException {
//        AnimalDatabase myDatabase = new AnimalDatabase();
//        for(Animal a: myDatabase.getAnimals()) {
//            System.out.println(a);
//        }


        AnimalDatabase myDatabase = new AnimalDatabase();
        Animal myAnimal = myDatabase.findAnimal(1);
        ArrayList<AnimalHistoryComments> allComments = new ArrayList<AnimalHistoryComments>();
        for (AnimalHistory h: myAnimal.getAnimalHistory()) {
            ArrayList<AnimalHistoryComments> myComments = h.getAnimalHistoryComments();
            for (AnimalHistoryComments c: myComments) {
                allComments.add(c);
            }
        }


    }
}
