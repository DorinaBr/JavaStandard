package session4.challenges;

import java.util.Scanner;

//Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.
public class ChallengeNineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

//        int max = (a > b) ? Math.max(a, c) : Math.max(b, c);

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is : " + max);
    }
}
