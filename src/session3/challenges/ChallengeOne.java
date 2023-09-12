package session3.challenges;

import java.util.Scanner;

// Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
public class ChallengeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Type your first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Now type your second number: ");
        int numberTwo = scanner.nextInt();

        String newline = System.lineSeparator();

        System.out.println("Now you're gonna see operations with your numbers: " + newline + "Addition: " + (numberOne + numberTwo));
        System.out.println("Subtraction: " + (numberOne - numberTwo) + newline + "Multiplication: " + (numberOne * numberTwo) + newline + "Division: " + (numberOne / numberTwo));
        System.out.println("Modulus: " + (numberOne % numberTwo));
    }
}
