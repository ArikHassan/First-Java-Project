package com.BasicApp;
/* The package statement is the first actual statement in a Java file (after comments)
and groups related classes and interfaces together. For example: package com.example.util;

BasicApp.java needs to be inside directory called "com.BasicApp", else there
will be errors in the package statement on line 1.
*/

// Scanner --> Scanner object built into Java to read user input
import java.util.Scanner;

public class BasicApp {
    public static void main(String[] args) {

        // Header message
        System.out.println("Basic App - This is a beginner level Java Application.");
        System.out.println("------------------------------------------------------");

        // Create tool to read user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input (name)
        System.out.println("Please enter your Username / Full Name:");

        // Create a variable type: String to store user input (name)
        String userName = scanner.nextLine(); // reads and assigns the next user input

        // Print a message using the users input
        System.out.println("\nGreetings " + userName + " and welcome to this Java application.\n" +
                "Please read the documentation in the projects' README.md file to get details about this program.");
    }
}