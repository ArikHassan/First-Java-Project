package com.BasicApp;

public class Student {
    // Student attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor for Student class
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // Method to display a students information
    void displayStudent(){
        System.out.println("Student Information:\n" +
                           "-------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Enrollment status: " + this.isEnrolled);
        System.out.println();
    }

}
