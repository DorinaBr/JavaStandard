package session_operators.challenges;

import java.util.Scanner;

// Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
public class ChallengeEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first boolean value: ");
        boolean firstBoolean = scanner.nextBoolean();

        System.out.println("Type the second boolean value:");
        boolean secondBoolean = scanner.nextBoolean();

        System.out.println("Values with applied '!' operator: " + (!firstBoolean) + ", " + (!secondBoolean));
    }
}
