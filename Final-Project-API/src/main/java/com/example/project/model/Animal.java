package com.example.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.SQLException;

//@Entity
//@Table
public class Animal {
//    @Id
//    @SequenceGenerator(
//            name = "ANIMAL",
//            sequenceName = "ANIMAL",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "ANIMAL"
//    )

//    private ArrayList<AnimalPrescription> animalPrescriptions;
//    private ArrayList<AnimalProblem> animalProblems;
//    private ArrayList<AnimalHistory> animalHistory;

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
        this.setBreed();
        this.setDateBirth();
        this.setCity();
        this.setName();
        this.setDateBirth();
        this.setSex();
        this.setStatus();
        this.setTattoo();
        this.setType();
        this.setUserID();
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) throws SQLException {
        this.animalID = animalID;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed() throws SQLException {
        this.breed = myJDBC.animalStatement(animalID, "Breed");
    }

    public String getCity() {
        return city;
    }

    public void setCity() throws SQLException {
        this.city = myJDBC.animalStatement(animalID, "City");
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth() throws SQLException {
        this.dateBirth = myJDBC.animalStatement(animalID, "Date_B");
    }

    public String getName() {
        return name;
    }

    public void setName() throws SQLException {
        this.name = myJDBC.animalStatement(animalID, "Name");
    }

    public String getSex() {
        return sex;
    }

    public void setSex() throws SQLException {
        this.sex = myJDBC.animalStatement(animalID, "Sex");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() throws SQLException {
        this.status = myJDBC.animalStatement(animalID, "Status");
    }

    public int getTattoo() {
        return tattoo;
    }

    public void setTattoo() throws SQLException {
        this.tattoo = Integer.parseInt(myJDBC.animalStatement(animalID, "Tattoo"));
    }

    public String getType() {
        return type;
    }

    public void setType() throws SQLException {
        this.type = myJDBC.animalStatement(animalID, "Type");;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID() throws SQLException {
        this.userID = Integer.parseInt(myJDBC.animalStatement(animalID, "User_ID"));
    }

    @Override
    public String toString() {
        return "Animal {" +
                "animalID= " + animalID +
                ", breed= '" + breed + '\'' +
                ", city= '" + city + '\'' +
                ", dateBirth= '" + dateBirth + '\'' +
                ", name= '" + name + '\'' +
                ", sex= '" + sex + '\'' +
                ", status= '" + status + '\'' +
                ", tattoo= " + tattoo +
                ", type= '" + type + '\'' +
                ", userID= " + userID +
                '}';
    }
}
