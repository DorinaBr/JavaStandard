package session_operators.challenges;

import java.util.Scanner;

//Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
public class ChallengeTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Type your first number: ");
        int number = scanner.nextInt();
        String newline = System.lineSeparator();

        System.out.println("Increment: " + (++number) + newline + "Decrement: " + (--number));

    }
}
