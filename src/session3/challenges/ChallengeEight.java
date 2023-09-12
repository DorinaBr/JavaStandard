package session3.challenges;

import java.util.Scanner;

//Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
public class ChallengeEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first byte value: ");
        byte firstB = scanner.nextByte();

        System.out.println("Type a second byte value: ");
        byte secondB = scanner.nextByte();

        System.out.println("The sum of the 2 values: " + (firstB+secondB));
    }
}
