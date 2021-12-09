package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeachingTechnician {
    ArrayList<Animal> animals;
    ArrayList<User> users;
    User teachingTechnician;
    UserDB userDB;
    ArrayList<User> blocklist;
    JDBCConnect jdbcConnect;

    public TeachingTechnician(User user) throws SQLException {
        teachingTechnician = user;
        animals = new ArrayList<>();
        users = new ArrayList<>();
        userDB = new UserDB();
        addUser();
//        addAnimal();
        blocklist = new ArrayList<>();
        jdbcConnect = new JDBCConnect();
        jdbcConnect.createConnection();
    }

    public void reloadUserDB() {
        users.clear();
        addUser();
    }


    public void blockStudent(User user) {
        if (user.getPermission().equals("Student")) {
            blocklist.add(user);
            userDB.deleteUser(String.valueOf(user.getUsername()), String.valueOf(user.getPassword()));
            reloadUserDB();
        }
    }

    public void removeStudent(User user) {
        if (user.getPermission().equals("Student")) {
            userDB.deleteUser(String.valueOf(user.getUsername()), String.valueOf(user.getPassword()));
            reloadUserDB();
        }
    }

    public Animal searchAnimalByName(String name) throws SQLException {
        for (Animal animal : animals)
            if (animal.getName().equals(name)) return animal;
        return null;
    }

    public Animal searchAnimalByID(int id) throws SQLException {
        for (Animal animal : animals)
            if (animal.getAnimalId() == id) return animal;
        return null;
    }


    public String userName() {
        return teachingTechnician.getFname();
    }

    public void addUser() {
        String user = (userDB.adminAccessGetUser());
        Scanner scanner = new Scanner(user);
        while (scanner.hasNextLine()) {
            String userPass = scanner.nextLine();
            users.add(new User(Integer.parseInt(userPass.substring(0, 6)), Integer.parseInt(userPass.substring(7))));
        }
        scanner.close();
    }

//    public void addAnimal() throws SQLException {
//        String animal = (userDB.adminAccessGetAnimal());
//        Scanner scanner = new Scanner(animal);
//        while (scanner.hasNextLine()) {
//            String animalId = scanner.nextLine();
//            animals.add(new Animal(Integer.parseInt(animalId)));
//        }
//        scanner.close();
//    }

    public void printUsers() {
        for (User u : users) {
            System.out.println(u);
            System.out.println();
        }
    }


    public void printAnimal() throws SQLException {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println();
        }
    }
//
//    public void requestAnimal(int id) throws SQLException {
//        userDB.updateAnimalStatusToRequested(id);
//        reloadUserDB();
//        animals.clear();
//        addAnimal();
//    }

    public void addComment(String recordId, String commentId, String description) throws SQLException {
        jdbcConnect.addAnimalComment(recordId, commentId, description);
    }

    public void seeAnimalComment(int animalId) {
        for (Animal ah : animals) {
            if (ah.getAnimalId() == animalId)
                System.out.println(ah.getAnimalHistory());
        }
    }
}