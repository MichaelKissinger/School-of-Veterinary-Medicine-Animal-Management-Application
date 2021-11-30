package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class Animal {

    private int animalID;

    private String breed;
    private String city;
    private String dateBirth;
    private String name;
    private String sex;
    private String status;
    private int tattoo;
    private String type;
    private int userID;

    private JDBCConnect myJDBC;

    public Animal(int animalID) throws SQLException {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalID = animalID;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) throws SQLException {
        this.animalID = animalID;
    }

    public String getBreed() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Breed");
    }

    public void setBreed(String breed) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Breed", breed);
    }

    public String getCity() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "City");
    }

    public void setCity(String city) throws SQLException {
        myJDBC.animalSetStatement(animalID, "City", city);
    }

    public String getDateBirth() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Date_B");
    }

    public void setDateBirth(String dateBirth) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Date_B", dateBirth);
    }

    public String getName() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Name");
    }

    public void setName(String name) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Name", name);
    }

    public String getSex() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Sex");
    }

    public void setSex(String sex) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Sex", sex);
    }

    public String getStatus() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Status");
    }

    public void setStatus(String status) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Status", status);
    }

    public int getTattoo() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetStatement(animalID, "Tattoo"));
    }

    public void setTattoo(String tattoo) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Tattoo", tattoo);
    }

    public String getType() throws SQLException {
        return myJDBC.animalGetStatement(animalID, "Type");
    }

    public void setType(String type) throws SQLException {
        myJDBC.animalSetStatement(animalID, "Type", type);
    }

    public int getUserID() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetStatement(animalID, "User_ID"));
    }

    public void setUserID(String userID) throws SQLException {
        myJDBC.animalSetStatement(animalID, "User_ID", userID);
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "Animal {" +
                "animalID= " + this.getAnimalID() +
                ", breed= '" + this.getBreed() + '\'' +
                ", city= '" + this.getCity() + '\'' +
                ", dateBirth= '" + this.getDateBirth() + '\'' +
                ", name= '" + this.getName() + '\'' +
                ", sex= '" + this.getSex() + '\'' +
                ", status= '" + this.getStatus() + '\'' +
                ", tattoo= " + this.getTattoo() +
                ", type= '" + this.getType() + '\'' +
                ", userID= " + this.getAnimalID() +
                '}';
    }
}
