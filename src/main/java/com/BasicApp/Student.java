package com.BasicApp;

public class Student {
    // Student attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // 3 Overloaded constructors============

    // 3-parameter Constructor for Student class
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // 2-parameter Constructor for Student class
    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.gpa = 0;
        this.isEnrolled = true;
    }

    // 1-parameter Constructor
    Student(String name){
        this.name = name;
        this.age = 0;
        this.gpa = 0;
        this.isEnrolled = true;
    }

    // Constructor overload for student created with 0 arguments
    Student(){
        this.name = "Guest";
        this.age = 0;
        this.gpa = 0;
        this.isEnrolled = true;
    }

    // Method to display a students information
    void displayStudent(){
        System.out.println("Student Information:\n" +
                           "-------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Enrollment status: " + (this.isEnrolled ? "Enrolled" : "Not Enrolled"));
        System.out.println();
    }

    void displayName(){
        System.out.println("Name: " + this.name);
    }

}
