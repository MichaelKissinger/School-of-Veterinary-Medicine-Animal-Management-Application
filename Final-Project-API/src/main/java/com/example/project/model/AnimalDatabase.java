package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Animal Database is used to load all animals from
 * the SQL database.
 * @author Michael Kissinger
 */
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
