package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalDatabase {
    private ArrayList<Animal> animalDatabase;

    private JDBCConnect myJDBC;

    public AnimalDatabase() throws SQLException {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.initializeDatabase();
    }

    public void initializeDatabase() throws SQLException {
        this.animalDatabase = myJDBC.animalFullGetStatement();
    }

    public ArrayList<Animal> getAnimals() {
        return animalDatabase;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animalDatabase = animals;
    }
}
