package com.example.project.model;


public class AnimalComment {

    private String commentID;
    private String userID;
    private String animalID;
    private String description;

    public AnimalComment(String commentID, String userID, String animalID, String description) {
        this.commentID = commentID;
        this.userID = userID;
        this.animalID = animalID;
        this.description = description;
    }
}
