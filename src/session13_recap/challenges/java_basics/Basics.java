package session13_recap.challenges.java_basics;

import java.util.Scanner;

public class Basics {
    static String name;
    static int intNUmber;
    static double doubleNumber;
    static long longNumber;
    static float floatNumber;
    static char character;
    static boolean bool;

    public static void main(String[] args) {
        System.out.println("Default value of String is: " + name + "\n" +
                "Default value of int is: " + intNUmber + "\n" +
                "Default value of double is: " + doubleNumber + "\n" +
                "Default value of long is: " + longNumber + "\n" +
                "Default value of float is: " + floatNumber + "\n" +
                "Default value of char is: " + character + "\n" +
                "Default value of boolean is: " + bool + "\n");

//    printMultiplicationResult();
//        printDivisionResult();
//        parseString();
//        printCharToIntConversion();
        //       printAverageOfFloat();
//        printOperationsWithBooleans();
//        printVariables();
//        printResultOfArithmeticOperations();
//        printResultOfCasting();
//        printUseOfAConstant();
    }

    public static void printMultiplicationResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number");
        int secondNumber = scanner.nextInt();

        long resultToLong = (long) firstNumber * secondNumber;
        System.out.println("The multiplication result is: " + resultToLong);
    }

    public static void printDivisionResult() {
        System.out.println("Enter first number");
        int numberOne = new Scanner(System.in).nextInt();

        int numberTwo = getDivisor();
        int result = numberOne / numberTwo;

        System.out.println("The result is: " + result);
    }

    private static int getDivisor() {
        System.out.println("Enter a second number");
        int numberTwo = new Scanner(System.in).nextInt();

        if (numberTwo == 0) {
            System.out.println("Division by 0 is not possible.");
            return getDivisor();
        }
        return numberTwo;
    }

    public static void parseString() {
        System.out.println("Enter a number");
        String input = new Scanner(System.in).next();

        try {
            Integer.parseInt(input);
            System.out.println("Good job!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please try again:");
            parseString();
        }
    }

    public static void printCharToIntConversion() {
        System.out.println("Enter a character");
        String inputChar = new Scanner(System.in).next();

        char character = inputChar.charAt(0);
        int numericValue = Character.getNumericValue(character);

        System.out.println("The numeric value of your character is: " + numericValue);
    }

    public static void printAverageOfFloat() {
        String print = "Enter a number with decimals";

        System.out.println(print);
        float firstNumber = new Scanner(System.in).nextFloat();

        System.out.println(print);
        float secondNumber = new Scanner(System.in).nextFloat();

        System.out.println(print);
        float thirdNumber = new Scanner(System.in).nextFloat();

        double average = ((double) firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of your numbers is: " + average);
    }

    public static void printOperationsWithBooleans() {
        System.out.println("Enter a boolean (true, false)");
        String firstInput = new Scanner(System.in).next();

        System.out.println("Enter another boolean (true, false)");
        String secondInput = new Scanner(System.in).next();

        boolean firstBoolean = Boolean.parseBoolean(firstInput);
        boolean secondBoolean = Boolean.parseBoolean(secondInput);

        System.out.println(" The result of 'AND' operation on your values is: " + (firstBoolean && secondBoolean));
        System.out.println(" The result of 'OR' operation on your values is: " + (firstBoolean || secondBoolean));
        System.out.println(" The result of 'NOT' operation on your values is: " + (!firstBoolean) + ", " + (!secondBoolean));
    }

    public static void printVariables() {
        String name = "Ana";
        int number = 10;
        double numberWithDecimals = 10.5;
        char character = 'c';
        boolean boolValue = true;

        System.out.println("The variables are: " + name + ", " + numberWithDecimals +
                ", " + character + ", " + boolValue);
    }

    public static void printResultOfArithmeticOperations() {
        int numberOne = 10;
        int numberTwo = 5;
        System.out.println("Addition: " + (numberOne + numberTwo) + "\n" +
                "Subtraction: " + (numberOne - numberTwo) + "\n" +
                "Multiplication: " + (numberOne * numberTwo) + "\n" +
                "Division: " + (numberOne / numberTwo));
    }

    public static void printResultOfCasting() {
        double anotherDouble = 10.56;
        int castedDouble = (int) anotherDouble;
        System.out.println("The double " + anotherDouble + " casted to an int is: " + castedDouble);
    }

    public static void printUseOfAConstant() {
        final double pi = 3.14;
        int radius = 10;
        double circleArea = pi * radius * radius;
        System.out.println("The area of the circle is: " + circleArea);
    }
}
