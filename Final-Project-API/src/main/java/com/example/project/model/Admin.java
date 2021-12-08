package com.example.project.model;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Admin class has full access to users and animals. It can add users, edit users, block users, monitor an animal's status, and review comments.
 * @author Arman Hosseinsarraf
 */

public class Admin {
    ArrayList<Animal> animals;
    ArrayList<User> users;
    User admin;
    UserDB userDB;
    ArrayList<User> blocklist;

    /**
     * Admin Constructor, creates objects from UserDB, List of users and animals and fills both lists from database
     * @param user logged in user
     * @throws SQLException
     */
    public Admin(User user) throws SQLException {
        admin = user;
        animals = new ArrayList<>();
        users = new ArrayList<>();
        userDB = new UserDB();
        addUser();
        addAnimal();
        blocklist = new ArrayList<>();
    }

    /**
     * Admin has access and makes changes to the users record and database
     * @param user
     * @param column
     * @param value
     */
    public void editUser(User user, String column, String value) {
        userDB.updateUserInfo(String.valueOf(user.getUsername()), String.valueOf(user.getPassword()), column, value);
        reloadUserDB();
    }

    /**
     * Admin can block users
     * @param user
     */
    public void blockUser(User user) {
        blocklist.add(user); // when admin blocks a user, it will be added to the blocklist too
        userDB.deleteUser(String.valueOf(user.getUsername()), String.valueOf(user.getPassword())); // that user will be deleted from the user
        reloadUserDB(); // database will be reloaded
    }

    public String userName() {
        return admin.getFname();
    }

    /**
     * addUser() loads the users from the database and keep them in the user list.
     */
    public void addUser() {
        String user = (userDB.adminAccessGetUser());
        Scanner scanner = new Scanner(user);
        while (scanner.hasNextLine()) {
            String userPass = scanner.nextLine();
            users.add(new User(Integer.parseInt(userPass.substring(0, 6)), Integer.parseInt(userPass.substring(7)))); // it creates a user object for each user id, password that exist on the database
        }
        scanner.close();
    }

    /**
     * addAnimal() loads the animals from the database and keep them in the animal list.
     */
    public void addAnimal() throws SQLException {
        String animal = (userDB.adminAccessGetAnimal());
        Scanner scanner = new Scanner(animal);
        while (scanner.hasNextLine()) {
            String animalId = scanner.nextLine();
            animals.add(new Animal(Integer.parseInt(animalId))); // it creates an animal object for each animal id that exist on the database
        }
        scanner.close();
    }

    public void printUsers() {
        for (User u : users) {
            System.out.println(u);
            System.out.println();
        }
    }

    /**
     * Admin can add a new user to the database
     * @param username
     * @param password
     * @param lName
     * @param fName
     * @param phone
     * @param email
     * @param sex
     * @param dateB
     * @param actDate
     * @param permission
     * @throws SQLException
     */
    public void addNewUser(String username, String password, String lName, String fName, String phone, String email, String sex, String dateB,String actDate, String permission) throws SQLException {
        userDB.addUserToDB(username, password, lName, fName, phone, email, sex, dateB, actDate, permission); // creates a new record to the database
        reloadUserDB();

    }

    /**
     * Admin con monitor animals status. This function prints out all animals' name and status exist in the database
     * @throws SQLException
     */
    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println(a.getName() + " Status: " + a.getStatus());
        }
    }

    /**
     * After each change in the database, the user list will be refreshed
     */
    public void reloadUserDB(){
        users.clear();
        addUser();
    }

    /**
     * Admin can see comments for each animal. This function gets an animal id and shows its comments
     * @param animalId
     */
    public void seeAnimalComment(int animalId) {
        for (Animal ah : animals) {
            if (ah.getAnimalId() == animalId)
                System.out.println(ah.getAnimalHistory());
        }
    }
}
