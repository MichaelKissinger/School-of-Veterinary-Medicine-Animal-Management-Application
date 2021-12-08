package com.example.project.model;

import lombok.SneakyThrows;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Animal class holds all variables for the animal,
 * along with getters, setters and toString method.
 * Also includes connection to database to pull info from SQL file.
 * @author Michael Kissinger
 */
public class Animal {

    private int animalId;

    private String breed;
    private String city;
    private String dateBirth;
    private String name;
    private String sex;
    private String status;
    private int tattoo;
    private String type;
    private int userID;

    private ArrayList<AnimalProblem> animalProblems;
    private ArrayList<AnimalPrescription> animalPrescriptions;
    private ArrayList<AnimalHistory> animalHistory;

    private JDBCConnect myJDBC;

    public Animal(int animalID) throws SQLException {
        myJDBC = new JDBCConnect();
        myJDBC.createConnection();
        this.animalId = animalID;
        setAnimalInfo();
        setAnimalProblems();
        setAnimalPrescriptions();
        setAnimalHistory();
    }

    public Animal(int animalId, String breed, String city,
                  String dateBirth, String name, String sex,
                  String status, int tattoo, String type, int userID) {
        this.animalId = animalId;
        this.breed = breed;
        this.city = city;
        this.dateBirth = dateBirth;
        this.name = name;
        this.sex = sex;
        this.status = status;
        this.tattoo = tattoo;
        this.type = type;
        this.userID = userID;
    }

    public ArrayList<AnimalProblem> getAnimalProblems() {
        return animalProblems;
    }

    public void setAnimalProblems() throws SQLException {
        this.animalProblems = myJDBC.animalGetProblems(animalId);
    }

    public ArrayList<AnimalPrescription> getAnimalPrescriptions() {
        return animalPrescriptions;
    }

    public void setAnimalPrescriptions() throws SQLException {
        this.animalPrescriptions = myJDBC.animalGetPrescriptions(animalId);
    }

    public ArrayList<AnimalHistory> getAnimalHistory() {
        return animalHistory;
    }

    public void setAnimalHistory() throws SQLException {
        this.animalHistory = myJDBC.animalGetHistory(animalId);
    }

    public void setAnimalInfo() throws SQLException {
        this.breed = this.getFromDBBreed();
        this.city = this.getFromDBCity();
        this.dateBirth = this.getFromDBDateBirth();
        this.name = this.getFromDBName();
        this.sex = this.getFromDBSex();
        this.status = this.getFromDBStatus();
//        this.tattoo = this.getFromDBTattoo();
        this.type = this.getFromDBType();
        this.userID = this.getFromDBUserID();
    }

    public String getFromDBBreed() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Breed");
    }

    public void setFromDBBreed(String breed) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Breed", breed);
    }

    public String getFromDBCity() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "City");
    }

    public void setFromDBCity(String city) throws SQLException {
        myJDBC.animalSetStatement(animalId, "City", city);
    }

    public String getFromDBDateBirth() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Date_B");
    }

    public void setFromDBDateBirth(String dateBirth) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Date_B", dateBirth);
    }

    public String getFromDBName() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Name");
    }

    public void setFromDBName(String name) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Name", name);
    }

    public String getFromDBSex() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Sex");
    }

    public void setFromDBSex(String sex) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Sex", sex);
    }

    public String getFromDBStatus() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Status");
    }

    public void setFromDBStatus(String status) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Status", status);
    }

    public int getFromDBTattoo() throws SQLException {
        try {
            return Integer.parseInt(myJDBC.animalGetStatement(animalId, "Tattoo"));
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
        return 0;
    }

    public void setFromDBTattoo(String tattoo) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Tattoo", tattoo);
    }

    public String getFromDBType() throws SQLException {
        return myJDBC.animalGetStatement(animalId, "Type");
    }

    public void setFromDBType(String type) throws SQLException {
        myJDBC.animalSetStatement(animalId, "Type", type);
    }

    public int getFromDBUserID() throws SQLException {
        return Integer.parseInt(myJDBC.animalGetStatement(animalId, "User_ID"));
    }

    public void setFromDBUserID(String userID) throws SQLException {
        myJDBC.animalSetStatement(animalId, "User_ID", userID);
    }


    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTattoo() {
        return tattoo;
    }

    public void setTattoo(int tattoo) {
        this.tattoo = tattoo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setAnimalProblems(ArrayList<AnimalProblem> animalProblems) {
        this.animalProblems = animalProblems;
    }

    public void setAnimalPrescriptions(ArrayList<AnimalPrescription> animalPrescriptions) {
        this.animalPrescriptions = animalPrescriptions;
    }

    public void setAnimalHistory(ArrayList<AnimalHistory> animalHistory) {
        this.animalHistory = animalHistory;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", breed='" + breed + '\'' +
                ", city='" + city + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", status='" + status + '\'' +
                ", tattoo=" + tattoo +
                ", type='" + type + '\'' +
                ", userID=" + userID +
                '}';
    }
}
