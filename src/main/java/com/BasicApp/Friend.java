package com.BasicApp;

public class Friend {

    String name;
    static int numOfFriends;
    /*
    -static = makes a variable or method belong to the class
              rather than to a specific object. Commonly
              used for utility methods or shared resources
    */

    // constructor
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    // static method
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends"); // no need for 'this' since attribute is static
    }
}
