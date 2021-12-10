package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Teaching Technician has functions of request an animal, block and remove students, search and view animal profiles, and take comments on animal profiles.
 * @author Arman Hosseinsarraf
 */
public class TeachingTechnician {
    AnimalDatabase animals;
    ArrayList<User> users;
    User teachingTechnician;
    UserDB userDB;
    ArrayList<User> blocklist;
    JDBCConnect jdbcConnect;

    /**
     * Teaching Technician Constructor, creates objects from UserDB, AnimalDB, List of users and animals and fills both lists from database
     *
     * @param user
     * @throws SQLException
     */
    public TeachingTechnician(User user) throws SQLException {
        teachingTechnician = user;
        animals = new AnimalDatabase();
        users = new ArrayList<>();
        userDB = new UserDB();
        addUser();
//        addAnimal();
        blocklist = new ArrayList<>();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    /**
     * After each change in the database, the user list will be refreshed
     */
    public void reloadUserDB() {
        users.clear();
        addUser();
    }

    /**
     * Teaching Technician can block students. The students will be added to blocklist so that they can not be added to the system again
     *
     * @param user
     */
    public void blockStudent(User user) {
        if (user.getPermission().equals("Student")) {
            blocklist.add(user);
            userDB.deleteUser(String.valueOf(user.getPassword())); // Student with that username and password will be deleted from the database
            reloadUserDB();
        }
    }

    /**
     * Teaching Technician can remove students.
     *
     * @param user
     */
    public void removeStudent(User user) {
        if (user.getPermission().equals("Student")) {
            userDB.deleteUser(String.valueOf(user.getPassword())); // Student with that username and password will be deleted from the database
            reloadUserDB();
        }
    }

    /**
     * Teaching Technician can search for an animal with the animal name
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public Animal searchAnimalByName(String name) throws SQLException {
        return animals.findAnimalByName(name);
    }

    /**
     * Teaching Technician can search for an animal with the animal ID
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Animal searchAnimalByID(int id) throws SQLException {
        return animals.findAnimal(id);
    }


    public String userName() {
        return teachingTechnician.getFname();
    }

    /**
     * addUser() loads the users from the database and keep them in the user list.
     */
    public void addUser() {
        String user = (userDB.adminAccessGetUser());
        Scanner scanner = new Scanner(user);
        while (scanner.hasNextLine()) {
            String userPass = scanner.nextLine();
            String[] a = userPass.split(" ");
            users.add(new User(Integer.parseInt(a[0]), Integer.parseInt(a[1]))); // it creates a user object for each user id, password that exist on the database
        }
        scanner.close();
    }


    /**
     * addAnimal() loads the animals from the database and keep them in the animal list.
     *
     * @throws SQLException
     */
//    public void addAnimal() throws SQLException {
//        String animal = (userDB.adminAccessGetAnimal());
//        Scanner scanner = new Scanner(animal);
//        while (scanner.hasNextLine()) {
//            String animalId = scanner.nextLine();
//            System.out.println(animalId);
//            animals.add(new Animal());
//        }
//        scanner.close();
//    }
    public void printUsers() {
        for (User u : users) {
            if (u.getStatus().equals("Active"))
                System.out.println(u);
        }
    }


//    public void printAnimal() throws SQLException {
//        for (Animal a : animals) {
//            System.out.println(a);
//            System.out.println();
//        }
//    }


    /**
     * Teaching Technician can request an animal with animal ID
     *
     * @param id
     * @throws SQLException
     */
    public void requestAnimal(int id) throws SQLException {
        userDB.updateAnimalStatusToRequested(id); // Animal status will be updated to "requested" in the database
        animals.initializeDatabase();

    }


//    public void requestAnimal(int id) throws SQLException {
//        userDB.updateAnimalStatusToRequested(id);
//        reloadUserDB();
//        animals.clear();
//        addAnimal();
//    }


    /**
     * Teaching Technician can add comments for each animal profiles
     *
     * @param recordId
     * @param description
     * @throws SQLException
     */
    public void addComment(String recordId, String description) throws SQLException {
        jdbcConnect.addAnimalComment(Integer.parseInt(recordId), description);
    }
}
