package com.example.project.model;

import java.sql.*;

public class UserDB {
    Connection connection;
    ResultSet rs;

    public void createConnection() {
        try {
            //You may have to enter your own SQL password below to make this work
            connection = DriverManager.getConnection("jdbc:mysql://localhost/VETMEDICINARYDB", "root", "9788");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int validateUser(int username, int pass) {
        int flag = -1;
        try {

            createConnection();
            Statement myStmt = connection.createStatement();
            rs = myStmt.executeQuery("SELECT * FROM USER WHERE Password = \"" + pass + "\" AND UserID = \"" + username + "\";");

            if (rs.next())
                flag = 1;
            else flag = 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public String getUserInfo(int username, int pass, String column) {
        StringBuffer userInformation = new StringBuffer();

        try {
            createConnection();
            Statement myStmt = connection.createStatement();
            rs = myStmt.executeQuery("SELECT * FROM USER WHERE Password = \"" + pass + "\" AND UserID = \"" + username + "\";");

            if (rs.next())
                userInformation.append(rs.getString(column));


        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInformation.toString();
    }

    public String getPermissionType(int username) {
        String permissionType = "";

        try {
            createConnection();
            Statement myStmt = connection.createStatement();
            String[] permissionList = {"Admin", "TEACHER_TECHNICIAN", "CARE_ATTENDANT", "HEALTH_TECHNICIAN", "STUDENT"};
            for (String permission : permissionList) {
                rs = myStmt.executeQuery("SELECT * FROM " + permission + " WHERE UserID = \"" + username + "\";");
                if (rs.next()) {

                    permissionType = rs.getString("Permission");
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return permissionType;
    }

    public String adminAccessGetUser() {
        StringBuffer result = new StringBuffer();
        try {
            createConnection();
            Statement myStmt = connection.createStatement();
            rs = myStmt.executeQuery("SELECT * FROM USER ;");

            while (rs.next())
                result.append(rs.getString("userID") + " " + rs.getString("Password") + "\n");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public String adminAccessGetAnimal() {
        StringBuffer result_animal = new StringBuffer();
        try {
            createConnection();
            Statement myStmt = connection.createStatement();
            rs = myStmt.executeQuery("SELECT * FROM ANIMAL ;");

            while (rs.next())
                result_animal.append(rs.getString("Animal_ID") + "\n");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result_animal.toString();
    }

    public void updateUserInfo(String username, String pass, String column, String update) {
        try {
            createConnection();
            Statement myStmt = connection.createStatement();

            myStmt.executeUpdate("UPDATE USER SET " + column + " = \"" + update + " \" WHERE UserID = " + username + " AND Password = " + pass + ";");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void deleteUser(String user, String pass) {
        try {
            createConnection();
            Statement myStmt = connection.createStatement();

            myStmt.executeUpdate("DELETE FROM STUDENT WHERE UserID = " + user + ";");
            myStmt.executeUpdate("DELETE FROM Admin WHERE UserID = " + user + ";");
            myStmt.executeUpdate("DELETE FROM HEALTH_TECHNICIAN WHERE UserID = " + user + ";");
            myStmt.executeUpdate("DELETE FROM TEACHER_TECHNICIAN WHERE UserID = " + user + ";");
            myStmt.executeUpdate("DELETE FROM CARE_ATTENDANT WHERE UserID = " + user + ";");
            myStmt.executeUpdate("DELETE FROM USER WHERE UserID = " + user + " AND Password = " + pass + ";");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addUserToDB(String username, String password, String lName, String fName, String phone, String email, String sex, String dateB, String activationDate, String permission) throws SQLException {
        String query = " insert into USER (UserID, Password, Lname, Fname, Phone , Email, Sex, Date_B, ActivationDate) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setInt(1, Integer.parseInt(username));
        preparedStmt.setInt(2, Integer.parseInt(password));
        preparedStmt.setString(3, lName);
        preparedStmt.setString(4, fName);
        preparedStmt.setString(5, phone);
        preparedStmt.setString(6, email);
        preparedStmt.setString(7, sex);
        preparedStmt.setString(8, dateB);
        preparedStmt.setString(9, activationDate);

        // execute the preparedstatement
        preparedStmt.execute();
        connection.close();
    }

    public void updateAnimalStatusToRequested(int id) {
        try {
            createConnection();
            Statement myStmt = connection.createStatement();

            myStmt.executeUpdate("UPDATE ANIMAL SET " + "Status = \"" + "Requested" + " \" WHERE Animal_ID = " + id + ";");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
