package com.BasicApp;
/* The package statement is the first actual statement in a Java file (after comments)
and groups related classes and interfaces together. For example: package com.example.util;

BasicApp.java needs to be inside directory called "com.BasicApp", else there
will be errors in the package statement on line 1.
*/

// Scanner --> Scanner object built into Java to read user input
import java.util.Scanner;

// LocalDate --> object to get the systems local date/time info
import java.time.LocalDate;

public class BasicApp {
    public static void main(String[] args) {

        // Header message
        System.out.println("Basic App - This is a beginner level Java Application.");
        System.out.println("------------------------------------------------------");

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input (name)
        System.out.println("Please enter your Username / Full Name:");

        // Use Scanner object to read a string from user
        // .nextLine() reads string inputted by user + returns inputted string
        String userName = scanner.nextLine();

        // Print a message using the users input
        // String concatenation using + operator
        System.out.println("\nGreetings " + userName + " and welcome to this Java application. Please read the\n" +
                "documentation in the projects' README.md file to get in-depth details\n" +
                "about this program.\n");

        //  Get users birth year to calculate current age
        System.out.println(userName + " please enter your birth year:");
        int birthYear = Integer.valueOf(scanner.nextLine()); // *using nextInt leaves \n in buffer*

        // Create LocalDate object to get current year
        LocalDate currentDate = LocalDate.now();

        // Access current year from LocalDate instance
        int currentYear = currentDate.getYear();
        //System.out.println("Current year is " + currentYear);

        // Use conditional statements to add validation for the inputted year
        if (birthYear > currentYear)
            System.out.println("Invalid birth year entered. Birth year can't be greater than " + currentYear);

        else if (birthYear < 0)
            System.out.println("Invalid birth year entered. Birth year can't be a negative number");

        else if (birthYear < (currentYear - 130))
            System.out.println("Invalid birth year entered. Birth year can't be greater than 130 years ago.\nHuman's don't live that long!");

        // Birth year is valid
        else {
            // Calculate and print user's age
            // use modulo operator to get age
            int userAge = currentYear % birthYear;
            System.out.println("You are currently " + (userAge - 1) + "/" + userAge + " years old\n");
        }

        // Ask user a true or false question

        // Print question with choice options
        System.out.println("Please enter: True OR False:\n" +
                "There are 8 planets in the Solar System...\n" +
                "========\n" +
                "|Options:\n" +
                "========\n" +
                "-TRUE/true = true\n" +
                "-FALSE/false/anything else = false");

        Boolean boolChoice = Boolean.valueOf(scanner.nextLine());

        System.out.println(boolChoice == true ? "Correct, there are 8 planets in our Solar System\n" : "Incorrect, there truly are 8 planets in our Solar System\n");

        // Ask user for 2 numbers to sum

        System.out.println("Please enter 2 numbers to get the sum:");
        System.out.printf("Num 1: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.printf("Num 2: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        // print the sum
        // System.out.println("The sum of the numbers is " + num1 + num2); // must use parentheses for the addition expression
        System.out.println("The sum of the numbers is " + (num1 + num2) + "\n");


        // Prompt for 2 strings to compare using string.equals()
        System.out.println("Lets compare 2 strings with each other. Note: comparison is case sensitive.");

        System.out.printf("Enter string 1: ");
        String str1 = scanner.nextLine();

        System.out.printf("Enter string 2: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)){
            System.out.println("The strings are the same!\n");
        } else {
            System.out.println("The strings are NOT the same!\n");
        }

    }
}