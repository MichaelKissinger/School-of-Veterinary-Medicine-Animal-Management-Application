package com.example.project.model;

import com.example.project.model.*;

import java.util.ArrayList;

public class Animal {
    private ArrayList<AnimalPicture> animalPictures;
    private ArrayList<AnimalStatus> animalStatuses;
    private ArrayList<AnimalPrescription> animalPrescriptions;
    private ArrayList<AnimalTreatment> animalTreatments;
    private ArrayList<AnimalComment> animalComments;

    private int animalID;
    private ArrayList<String> animalInfo;

    private String animalWeight;
    private String animalTattooNumber;
    private String cityTattooNumber;
    private String animalBirthDate;

    private String Breed;
    private String Sex;
    private String RFID;
    private String Microchip;
    private String status;
    private String draughtMeatDairy;

    private String region;
    private String subspecies;
    private String distinguishingFeatures;
    private String colour;

    public Animal() {
        this.populateAnimalInfoList();
    }

    public void populateAnimalInfoList() {
        animalInfo.add(animalWeight);
        animalInfo.add(animalTattooNumber);
        animalInfo.add(cityTattooNumber);
        animalInfo.add(animalBirthDate);

        animalInfo.add(Breed);
        animalInfo.add(Sex);
        animalInfo.add(RFID);
        animalInfo.add(Microchip);
        animalInfo.add(status);
        animalInfo.add(draughtMeatDairy);

        animalInfo.add(region);
        animalInfo.add(subspecies);
        animalInfo.add(distinguishingFeatures);
        animalInfo.add(colour);
    }

    public ArrayList<String> getAnimalInfo() {
        return animalInfo;
    }

    public ArrayList<AnimalPicture> getAnimalPictures() {
        return animalPictures;
    }

    public void setAnimalPictures(ArrayList<AnimalPicture> animalPictures) {
        this.animalPictures = animalPictures;
    }

    public ArrayList<AnimalStatus> getAnimalStatuses() {
        return animalStatuses;
    }

    public void setAnimalStatuses(ArrayList<AnimalStatus> animalStatuses) {
        this.animalStatuses = animalStatuses;
    }

    public ArrayList<AnimalPrescription> getAnimalPrescriptions() {
        return animalPrescriptions;
    }

    public void setAnimalPrescriptions(ArrayList<AnimalPrescription> animalPrescriptions) {
        this.animalPrescriptions = animalPrescriptions;
    }

    public ArrayList<AnimalTreatment> getAnimalTreatments() {
        return animalTreatments;
    }

    public void setAnimalTreatments(ArrayList<AnimalTreatment> animalTreatments) {
        this.animalTreatments = animalTreatments;
    }

    public ArrayList<AnimalComment> getAnimalComments() {
        return animalComments;
    }

    public void setAnimalComments(ArrayList<AnimalComment> animalComments) {
        this.animalComments = animalComments;
    }

    public void addAnimalPicture(AnimalPicture animalPicture) {
        animalPictures.add(animalPicture);
    }

    public void updateAnimalStatus(AnimalStatus animalStatuses) {}

    public void addAnimalPrescription(AnimalPrescription animalPrescription) {
        animalPrescriptions.add(animalPrescription);
    }

    public void addAnimalTreatment(AnimalTreatment animalTreatment) {
        animalTreatments.add(animalTreatment);
    }

    public void addAnimalComment(AnimalComment animalComment) {
        animalComments.add(animalComment);
    }

    public void updateInformation(String info) {}


}
