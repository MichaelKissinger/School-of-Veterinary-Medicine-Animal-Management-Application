package com.example.project.model;

public class AnimalPicture {

    private int imageID;
    private int userID;
    private String creationDate;
    private String fileName;
    private String type;

    public AnimalPicture(int imageID, int userID, String creationDate, String fileName, String type) {
        this.imageID = imageID;
        this.userID = userID;
        this.creationDate = creationDate;
        this.fileName = fileName;
        this.type = type;
    }
}