package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class AnimalHistory {

    private int recordId;
    private String date;
    private String measurement;
    private int value;
    private String userId;
    private String vaccination;
    private int animalId;

    private JDBCConnect myJDBC;

    public AnimalHistory(int animalId) {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalId = animalId;
    }

    public int getRecordId() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetHistory(animalId, "Record_ID"));
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getDate() throws SQLException {
        return myJDBC.animalGetHistory(animalId, "Date");
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMeasurement() throws SQLException {
        return myJDBC.animalGetHistory(animalId, "Measurment");
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getValue() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetHistory(animalId, "Value"));
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUserId() throws SQLException {
        return myJDBC.animalGetHistory(animalId, "User_ID");
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVaccination() throws SQLException {
        return myJDBC.animalGetHistory(animalId, "Vaccination");
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public int getAnimalId() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetHistory(animalId, "Animal_ID"));
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "AnimalHistory{" +
                "recordId=" + this.getRecordId() +
                ", date='" +this.getDate() + '\'' +
                ", measurement='" + this.getMeasurement() + '\'' +
                ", value=" + this.getValue() +
                ", userId='" + this.getUserId() + '\'' +
                ", vaccination='" + this.getVaccination() + '\'' +
                ", animalId=" + this.getAnimalId() +
                '}';
    }
}
