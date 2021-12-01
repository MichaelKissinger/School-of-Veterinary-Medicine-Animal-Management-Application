package com.example.project.model;

import java.sql.*;

public class UserDB {
    Connection connection;
    ResultSet rs;


    public int validateUser(int username, int pass) {
        int flag = -1;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/VETMEDICINARYDB", "root", "9788");
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost/VETMEDICINARYDB", "root", "9788");
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost/VETMEDICINARYDB", "root", "9788");
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
}
