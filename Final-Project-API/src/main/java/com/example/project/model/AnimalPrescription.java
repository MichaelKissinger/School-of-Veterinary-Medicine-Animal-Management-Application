package com.example.project.model;

public class AnimalPrescription {
    private String scriptRecord;
    private String userID;
    private String animalID;
    private String date;
    private String instructions;
    private String drugID;
    private String dosage;
    private String deliveryMethod;
    private String drugName;

    public AnimalPrescription(String scriptRecord, String userID, String animalID, String date, String instructions, String drugID, String dosage, String deliveryMethod, String drugName) {
        this.scriptRecord = scriptRecord;
        this.userID = userID;
        this.animalID = animalID;
        this.date = date;
        this.instructions = instructions;
        this.drugID = drugID;
        this.dosage = dosage;
        this.deliveryMethod = deliveryMethod;
        this.drugName = drugName;
    }
}
