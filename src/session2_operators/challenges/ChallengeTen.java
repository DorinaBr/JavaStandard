package session2_operators.challenges;

import java.util.Scanner;

//Write a program that reverses the sign of an entered integer using unary minus operator.
public class ChallengeTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        System.out.println("Your sign number is reversed: " + (number = -number));
    }
}
