package com.example.project.model;

import java.util.ArrayList;

public class Admin {
    ArrayList<Animal> animals;


    public Admin(LoginChecker user) {

        animals = new ArrayList<>();
    }

    public void addNewAnimal(Animal animal){
        animals.add(animal);
    }


}
