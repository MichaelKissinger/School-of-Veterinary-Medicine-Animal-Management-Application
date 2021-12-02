package com.example.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    ArrayList<Animal> animals;
    ArrayList<User> users;
    User admin;
    UserDB userDB;

    public Admin(User user) {
        admin = user;
        animals = new ArrayList<>();
        users = new ArrayList<>();
        userDB = new UserDB();
        addUser();
    }

    public void addNewAnimal(Animal animal) {
        animals.add(animal);
    }

    public String userName() {
        return admin.getFname();
    }

    public void addUser() {
        String user = (userDB.adminAccess());
        Scanner scanner = new Scanner(user);
        while (scanner.hasNextLine()) {
            String userPass = scanner.nextLine();
            users.add(new User(Integer.parseInt(userPass.substring(0, 6)), Integer.parseInt(userPass.substring(7))));
        }
        scanner.close();
    }

    public void printUsers() {
        for (User u: users){
            System.out.println(u);
            System.out.println();
        }
    }
}
