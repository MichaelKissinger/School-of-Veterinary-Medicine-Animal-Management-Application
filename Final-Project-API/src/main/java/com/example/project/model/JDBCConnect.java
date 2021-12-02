package com.example.project.model;

import java.sql.*;
import java.util.ArrayList;

public class JDBCConnect {

    private Connection dbConnect;

    public void createConnection() {
        try {
            //You may have to enter your own SQL password below to make this work
            dbConnect = DriverManager.getConnection("jdbc:mysql://localhost/VETMEDICINARYDB", "root", "Katana123!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String animalGetStatement(int animalID, String trait) throws SQLException {
        StringBuffer animalInfo = new StringBuffer();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM ANIMAL WHERE Animal_ID = \"" + animalID + "\";");

            while (results.next()) {
                animalInfo.append(results.getString(trait));
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalInfo.toString();
    }

    public void animalSetStatement(int animalID, String column, String change) throws SQLException {
        StringBuffer animalInfo = new StringBuffer();
        try {
            Statement myStmt = dbConnect.createStatement();
            myStmt.executeUpdate("UPDATE ANIMAL SET " + column + " = \"" + change +" \" WHERE Animal_ID = \""+ animalID +"\";");

            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<AnimalPrescription> animalGetPrescriptions(int animalID) throws SQLException {
        StringBuffer animalInfo = new StringBuffer();
        ArrayList<AnimalPrescription> animalPrescriptions = new ArrayList<AnimalPrescription>();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM ANIMAL_PRESCRIPTION WHERE Animal_ID = \"" + animalID + "\";");

            while (results.next()) {

                int scriptRecord = results.getInt("Script_Record");
                String drugName = results.getString("Drug_Name");
                String deliveryMethod = results.getString("Delivery_Method");
                int userId = results.getInt("User_ID");
                String date = results.getString("Date");
                int dosage = results.getInt("Dosage");
                String instructions = results.getString("Instructions");
                String treatmentMethod = results.getString("Treatment_Method");
                int animalId = results.getInt("Animal_ID");;

                AnimalPrescription myPrescription = new AnimalPrescription(scriptRecord, drugName, deliveryMethod, userId, date, dosage, instructions, treatmentMethod, animalId);
                animalPrescriptions.add(myPrescription);
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalPrescriptions;
    }

    public ArrayList<AnimalProblem> animalGetProblems(int animalId1) throws SQLException {
        ArrayList<AnimalProblem> animalProblems = new ArrayList<AnimalProblem>();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM ANIMAL_PROBLEM WHERE Animal_ID = \"" + animalId1 + "\";");

            while (results.next()) {
                int animalId2 = results.getInt("Animal_ID");
                String disease = results.getString("Disease");
                String description = results.getString("Description");

                AnimalProblem myProblem = new AnimalProblem(animalId2, disease, description);
                animalProblems.add(myProblem);
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalProblems;
    }

    public ArrayList<AnimalHistory> animalGetHistory(int animalId1) throws SQLException {
        ArrayList<AnimalHistory> animalHistory = new ArrayList<AnimalHistory>();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM HISTORY WHERE Animal_ID = \"" + animalId1 + "\";");

            while (results.next()) {

                int recordId = results.getInt("Record_ID");
                String date  = results.getString("Date");
                String measurement  = results.getString("Measurment");
                int value = results.getInt("Value");
                String userId = results.getString("User_ID");
                String vaccination = results.getString("Vaccination");
                int animalId = results.getInt("Animal_ID");

                AnimalHistory myHistory = new AnimalHistory(recordId, date, measurement, value, userId, vaccination, animalId);
                animalHistory.add(myHistory);
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalHistory;
    }

    public ArrayList<AnimalHistoryComments> animalGetComment(int recordID) throws SQLException {
        ArrayList<AnimalHistoryComments> animalComment = new ArrayList<AnimalHistoryComments>();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM HISTORY_COMMENTS WHERE Record_ID = \"" + recordID + "\";");

            while (results.next()) {
                int recordId = results.getInt("Record_ID");
                int commentId = results.getInt("Comment_ID");
                String description = results.getString("Description");

                AnimalHistoryComments myComment = new AnimalHistoryComments(recordId, commentId, description);
                animalComment.add(myComment);
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalComment;
    }

    public ArrayList<AnimalHistoryPhotos> animalGetPhoto(int recordID) throws SQLException {
        ArrayList<AnimalHistoryPhotos> animalPhoto = new ArrayList<AnimalHistoryPhotos>();
        try {
            Statement myStmt = dbConnect.createStatement();
            ResultSet results = myStmt.executeQuery("SELECT * FROM HISTORY_PHOTOS WHERE Record_ID = \"" + recordID + "\";");

            while (results.next()) {
               int recordId = results.getInt("Record_ID");
               int imageId = results.getInt("Image_ID");
               String fileName = results.getString("File_Name");
               String type = results.getString("Type");

               AnimalHistoryPhotos myPhoto = new AnimalHistoryPhotos(recordId, imageId, fileName, type);
               animalPhoto.add(myPhoto);
            }
            myStmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return animalPhoto;
    }



}
