package com.example.project.model;


//TODO can be deleted
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

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AnimalComment{" +
                "commentID='" + commentID + '\'' +
                ", userID='" + userID + '\'' +
                ", animalID='" + animalID + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
