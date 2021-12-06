package com.example.project;

import com.example.project.model.Animal;
import com.example.project.model.AnimalDatabase;

import java.sql.SQLException;

public class test {

    public static void main(String[] args) throws SQLException {
        AnimalDatabase myDatabase = new AnimalDatabase();
        for(Animal a: myDatabase.getAnimals()) {
            System.out.println(a);
        }
    }
}
