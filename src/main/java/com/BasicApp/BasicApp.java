package com.BasicApp;
/* The package statement is the first actual statement in a Java file (after comments)
and groups related classes and interfaces together. For example: package com.example.util;

BasicApp.java needs to be inside directory called "com.BasicApp", else there
will be errors in the package statement on line 1.
*/

// Scanner --> Scanner object built into Java to read user input
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
// LocalDate --> object to get the systems local date/time info
import java.time.LocalDate;

public class BasicApp {
    public static void main(String[] args) {

        // Header message
        System.out.println("Basic App - This is a beginner level Java Application.");
        System.out.println("------------------------------------------------------");
        //====================================================================================
        // Declare built-in objects to be used

        // Create Random object to generate random values
        Random random = new Random();

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //====================================================================================
        // User input using Scanner Class Obj

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

        //====================================================================================
        // Conditional Logic

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

        //====================================================================================
        // Ternary Operator

        // Print question with choice options
        System.out.println("True OR False?\n" +
                "There are 8 planets in the Solar System...\n\n" +
                "(System will generate random TRUE/FALSE value))\n");
        //( Java evaluates true/TRUE as true & false/FALSE/anything else as false)

        // generate random boolean value
        Boolean boolChoice = random.nextBoolean();

        // print generated value
        System.out.println("Generated T/F Value: " + boolChoice);

        System.out.println(boolChoice ? "Correct, there are 8 planets in our Solar System\n" : "Incorrect, there truly are 8 planets in our Solar System\n");

        //====================================================================================
        // Sum calculation

        // Ask user for 2 numbers to sum
        System.out.println("Let's calculate the sum of 2 numbers.");

        // Declare number variables
        int num1 = 26;
        int num2 = 4;

        // print number values
        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);

        // print the sum
        // System.out.println("The sum of the numbers is " + num1 + num2); // must use parentheses for the addition expression
        System.out.println("The sum of the numbers is " + (num1 + num2) + "\n");

        //====================================================================================
        // String comparison
        // Prompt for 2 strings to compare using string.equals()
        System.out.println("String comparison using String.equals(). Note: comparison is case sensitive.\n" +
                "----------------------------------------------------------------------------");

        // declare string variables
        String string1 = "Beach Hut";
        String string2 = "BEACH HUT";

        // Print string values
        System.out.println("string 1: " + string1);
        System.out.println("string 2: " + string2);

        if (string1.equals(string2)) {
            System.out.println("The strings are the same!\n");
        } else {
            System.out.println("The strings are NOT the same!\n");
        }

        //====================================================================================
        // Generate random values using Java's random class
        // (import Random object at top of file)

        System.out.println("Random value generation using Random object\n" +
                "-------------------------------------------");

        // declare & assign variables with random numbers
        int randomNum1 = random.nextInt(); // generates random number with no bounds/limits
        int randomNum2 = random.nextInt(10, 101); // random number BETWEEN param1(inclusive) and param2(exclusive) param1 >= && < param2

        // try with type double, using nextDouble()
        double randomNum3 = random.nextDouble(1, 1001);

        // try with type boolean
        boolean randomBool = random.nextBoolean();

        // Print the generated random number
        System.out.print("randomNum1: " + randomNum1 + "\n");
        System.out.print("randomNum2: " + randomNum2 + "\n");
        System.out.print("randomNum3: " + randomNum3 + "\n");

        System.out.print("\nHeads or tails? --> ");
        System.out.println(randomBool ? "Heads" : "Tails" + "\n");

        //====================================================================================
        // Math constants + Methods

        System.out.println("\nMathematical constants & methods in Java:\n" +
                "-----------------------------------------\n");

        // Built in CONST for pi
        System.out.println("The value of PI is " + Math.PI);

        // Built in CONST for E (Eulers number / exponential constant)
        System.out.println("The Exponential Constant / Eulers number is " + Math.E + "\n");

        // Raise a base to a power using pow()
        double powerResult = Math.pow(5, 4);
        System.out.println("Raising to power using .pow()");
        System.out.println("5 to the power of 4 = " + powerResult + "\n");

        // Get absolute value of a given value using Math.abs()
        int absVal1 = -7;
        int absVal2 = 50;

        System.out.println("Absolute values using .abs()");
        System.out.println("Absolute value of " + absVal1 + " is " + Math.abs(absVal1));
        System.out.println("Absolute value of " + absVal2 + " is " + Math.abs(absVal2) + "\n");

        // get Square Root of a number using Math.sqrt()
        int squaredNum = 25;
        double squareRoot = Math.sqrt(squaredNum);
        System.out.println("Square root using .sqrt()");
        System.out.println("The square root of " + squaredNum + " is " + squareRoot + "\n");

        // Rounding numbers using Math.round()
        double roundNum1 = 2.5;
        double roundNum2 = 3.7;
        double roundNum3 = 4.49;

        System.out.println("Rounding numbers using .round()");
        System.out.println(roundNum1 + " rounds to " + Math.round(roundNum1));
        System.out.println(roundNum2 + " rounds to " + Math.round(roundNum2));
        System.out.println(roundNum3 + " rounds to " + Math.round(roundNum3) + "\n");

        // Forced rounding using Math.ceil & Math.floor
        System.out.println("Force rounding using .ceil() & .floor()");
        System.out.println(roundNum3 + " rounds UP to " + Math.ceil(roundNum3));
        System.out.println(roundNum2 + " rounds DOWN to " + Math.floor(roundNum2) + "\n");

        // Get MAX & MIN between 2 values using .max & .min
        System.out.println("Get MAX & MIN values from a range using .max() & .min()");
        System.out.println("The MAX between 50 & 100 is " + Math.max(50, 100));
        System.out.println("The MIN between 50 & 100 is " + Math.max(50, 100) + "\n");

        //====================================================================================
        // Enhanced switch statements --> better alternative to multiple else if statements (Java 14 feature)
        System.out.println("Finding the season using Switch Statement\n" +
                "-----------------------------------------");

        String month = "January";

        System.out.println("The current month is " + month);
        switch (month) {
            case "January", "February", "December" -> System.out.println("It is a WINTER month");
            case "March", "April", "May" -> System.out.println("It is a SPRING month");
            case "June", "July", "August" -> System.out.println("It is a SUMMER month");
            case "September", "October", "November" -> System.out.println("It is a FALL month");
            default -> System.out.println(month + " is not a VALID month");
        }

        //====================================================================================
        // Loops
        System.out.println("Loops in Java: while, for, for each, do-while");
        //====================================================================================
        // While-loop
        System.out.println("While-loop:\n" +
                "----------");
        int countDown = 5;

        System.out.println("countDown = " + countDown);
        System.out.println("print countDown while countDown > 0");

        while (countDown > 0) {
            System.out.println(countDown--);
        }
        System.out.println("While-loop exited\n");

        //====================================================================================
        // For-loop & For Each loop
        System.out.println("For-loop:\n" +
                "--------");
        // Declare and initialize array
        String[] fruits = {"apple", "banana", "pomegranate"};
        String[] names = {"Arik", "Andy", "Hassan", "Saleh"};

        System.out.println("Printing 'fruits' array elements using for-loop");
        for (int idx = 0; idx < fruits.length; idx++) {
            System.out.println(fruits[idx]);
        }
        System.out.println("For-loop exited\n");

        System.out.println("Printing 'names' array using forEach-loop");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println("ForEach-loop exited\n");

        //====================================================================================
        // Method calls
        System.out.println("Method Calls\n" +
                "------------");
        // call greeting method
        greeting(userName); // userName --> defined in beginning of program

        // call getProduct method
        int multiple1 = 10;
        int multiple2 = 5;
        int result = getProduct(multiple1, multiple2);

        // display result
        System.out.println(multiple1 + " * " + multiple2 + " = " + result + "\n");

        // call greeting method overload
        greeting(userName, birthYear);


        //====================================================================================
        // Custom Class --> Car
        System.out.println("Car class\n" +
                "---------");
        // Create a car object using Car class
        Car myCar = new Car();

        // Print car attributes
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.price);

        // Start the car
        myCar.startCar();

        // Stop the car
        myCar.stopCar();

        // Drive the car
        myCar.drive();

        // Brake the car
        myCar.brake();
        System.out.println();

        //====================================================================================
        // Custom Class --> Student
        System.out.println("Student class\n" +
                "-------------");
        // Create 2 new students (calls 3 param constructor)
        Student student1 = new Student("John", 17, 3.0);
        Student student2 = new Student("Annie", 18, 4.0);

        // Create 1 new student (calls 1 param constructor)
        Student student3 = new Student("Albert");

        // Create student with no arguments
        Student student4 = new Student();

        // Call member method for student class
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();

        //====================================================================================
        // Array of  student objects

        // create an array of student objects
        Student[] studentArr = {student1, student2, student3, student4};

        // Alternative way to create array and specify size
        // Student[] studentArr = new Student[5];

        // loop through the student array using forEach loop
        System.out.println("Student list:");
        for (Student student : studentArr){
            student.displayName();
        }

        //====================================================================================
        // Friend class
        // -uses static numOfFriends attribute to keep track of friend count

        System.out.println("Friend class\n" +
                           "------------");
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Tom");
        Friend friend3 = new Friend("Alice");

//      System.out.println("Number of friends: " + friend1.numOfFriends); // uses a specific object to access static var
        System.out.println("Number of friends: " + Friend.numOfFriends);


    }

    //====================================================================================
    // Methods in Java
    // format: (return type) (method identifier) (parameter list) {}
    // java wants 'static' keyword because when this method is called within a static method like 'main'
    static void greeting(String userName) {
        System.out.println("greeting(String)");
        System.out.printf("Hello %s\n\n", userName);
    }

    static int getProduct(int val1, int val2){
        System.out.println("getProduct() called");
        return val1 * val2;
    }

    // greeting method overload
    static void greeting(String userName, int age){
        System.out.println("greeting(String, int)");
        System.out.printf("Hello %s, you were born in %d\n\n", userName, age);
    }
}