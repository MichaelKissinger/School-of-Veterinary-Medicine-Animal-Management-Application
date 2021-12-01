package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class AnimalPrescription {
    private int scriptRecord;
    private String drugName;
    private String deliveryMethod;
    private int userId;
    private String date;
    private int dosage;
    private String instructions;
    private String treatmentMethod;
    private int animalId;

    private JDBCConnect myJDBC;

    public AnimalPrescription(int animalId) {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalId = animalId;
    }

    public int getScriptRecord() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetPrescription(animalId, "Script_Record"));
    }

    public void setScriptRecord(int scriptRecord) {
        this.scriptRecord = scriptRecord;
    }

    public String getDrugName() throws SQLException {
        return myJDBC.animalGetPrescription(animalId, "Drug_Name");
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDeliveryMethod() throws SQLException {
        return myJDBC.animalGetPrescription(animalId, "Delivery_Method");
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public int getUserId() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetPrescription(animalId, "User_ID"));
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() throws SQLException {
        return myJDBC.animalGetPrescription(animalId, "Date");
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDosage() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetPrescription(animalId, "Dosage"));
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getInstructions() throws SQLException {
        return myJDBC.animalGetPrescription(animalId, "Instructions");
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTreatmentMethod() throws SQLException {
        return myJDBC.animalGetPrescription(animalId, "Treatment_Method");
    }

    public void setTreatmentMethod(String treatmentMethod) {
        this.treatmentMethod = treatmentMethod;
    }

    public int getAnimalId() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetPrescription(animalId, "Animal_ID"));
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "AnimalPrescription{" +
                "scriptRecord=" + this.getScriptRecord() +
                ", drugName='" + this.getDrugName() + '\'' +
                ", deliveryMethod='" + this.getDeliveryMethod() + '\'' +
                ", userId=" + this.getUserId() +
                ", date='" + this.getDate() + '\'' +
                ", dosage=" + this.getDosage() +
                ", instructions='" + this.getInstructions() + '\'' +
                ", treatmentMethod='" + this.getTreatmentMethod() + '\'' +
                ", animalId=" + this.getAnimalId() +
                '}';
    }
}
