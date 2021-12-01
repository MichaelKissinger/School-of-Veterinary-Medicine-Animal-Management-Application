package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class AnimalProblem {

    private int animalId;
    private String disease;
    private String description;

    private JDBCConnect myJDBC;

    public AnimalProblem(int animalId) {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalId = animalId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getDisease() throws SQLException {
        return myJDBC.animalGetProblem(animalId, "Disease");
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDescription() throws SQLException {
        return myJDBC.animalGetProblem(animalId, "Description");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "AnimalProblem{" +
                "animalId=" + this.getAnimalId() +
                ", disease='" + this.getDisease() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                '}';
    }
}
