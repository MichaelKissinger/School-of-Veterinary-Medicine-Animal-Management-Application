package com.example.project.model;

import java.util.ArrayList;

public class Admin {
    ArrayList<Object> students;
    ArrayList<Object> animals;
    ArrayList<Object> blockList;
    Object admin;
    String response;

    public void addStudent(Object newStudent) {
        if (!(students.contains(newStudent)))
            students.add(newStudent);
    }

    public void removeStudent(Object student) {
        students.remove(student);
    }

    public void blockStudent(Object student) {
        blockList.add(student);
        removeStudent(student);
    }

    public void addAnimal(Object animal, String comment) {
//        animals.get(animal).add(comment);
    }

    public ArrayList<Object> requestAnimalList() {
        return animals;
    }

    public void displayAdminInfo() {
//        System.out.println("Name: "+ admin.getName()+ "Last Name: "+ admin.getLastName()+ "Birth Date: "+ admin.getBirthDate());
    }

    public void DisplayAnimals() {
        for (Object animal : animals)
            System.out.println(animal.toString());
    }

    public void displayUsers() {
        for (Object user : students)
            System.out.println(user.toString());
    }
}
