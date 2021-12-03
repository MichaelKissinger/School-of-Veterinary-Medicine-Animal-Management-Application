package com.example.project.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    ArrayList<Animal> animals;
    ArrayList<User> users;
    User admin;
    UserDB userDB;

    public Admin(User user) throws SQLException {
        admin = user;
        animals = new ArrayList<>();
        users = new ArrayList<>();
        userDB = new UserDB();
        addUser();
        addAnimal();
    }

    public void editUser(User user, String column, String value) {
        userDB.updateUserInfo(String.valueOf(user.getUsername()), String.valueOf(user.getPassword()), column, value);
        addUser();
    }

    public String userName() {
        return admin.getFname();
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

    public void addAnimal() throws SQLException {
        String animal = (userDB.adminAccessGetAnimal());
        Scanner scanner = new Scanner(animal);
        while (scanner.hasNextLine()) {
            String animalId = scanner.nextLine();
            animals.add(new Animal(Integer.parseInt(animalId)));
        }
        scanner.close();
    }

    public void printUsers() {
        for (User u : users) {
            System.out.println(u);
            System.out.println();
        }
    }

    public void printAnimal() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println();
        }
    }
}
