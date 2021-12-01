package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class Animal {

    private int animalId;

//    private String breed;
//    private String city;
//    private String dateBirth;
//    private String name;
//    private String sex;
//    private String status;
//    private int tattoo;
//    private String type;
//    private int userID;

    private JDBCConnect myJDBC;

    public Animal(int animalID) throws SQLException {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalId = animalID;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) throws SQLException {
        this.animalId = animalId;
    }

    public String getBreed() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Breed");
    }

    public void setBreed(String breed) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Breed", breed);
    }

    public String getCity() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "City");
    }

    public void setCity(String city) throws SQLException {
        myJDBC.animalSetStatement(animalId, "City", city);
    }

    public String getDateBirth() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Date_B");
    }

    public void setDateBirth(String dateBirth) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Date_B", dateBirth);
    }

    public String getName() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Name");
    }

    public void setName(String name) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Name", name);
    }

    public String getSex() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Sex");
    }

    public void setSex(String sex) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Sex", sex);
    }

    public String getStatus() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Status");
    }

    public void setStatus(String status) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Status", status);
    }

    public int getTattoo() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetStatement(animalId, "Tattoo"));
    }

    public void setTattoo(String tattoo) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Tattoo", tattoo);
    }

    public String getType() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Type");
    }

    public void setType(String type) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Type", type);
    }

    public int getUserID() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetStatement(animalId, "User_ID"));
    }

    public void setUserID(String userID) throws SQLException {
        myJDBC.animalSetStatement(animalId, "User_ID", userID);
    }

    @SneakyThrows
    @Override
    public String toString() {
        return "Animal {" +
                "animalID= " + this.getAnimalId() +
                ", breed= '" + this.getBreed() + '\'' +
                ", city= '" + this.getCity() + '\'' +
                ", dateBirth= '" + this.getDateBirth() + '\'' +
                ", name= '" + this.getName() + '\'' +
                ", sex= '" + this.getSex() + '\'' +
                ", status= '" + this.getStatus() + '\'' +
                ", tattoo= " + this.getTattoo() +
                ", type= '" + this.getType() + '\'' +
                ", userID= " + this.getUserID() +
                '}';
    }
}
