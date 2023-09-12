package session3.challenges;

import java.util.Scanner;

//Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
public class ChallengeNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the length of the rectangle : ");
        int length = scanner.nextInt();

        System.out.println("Type the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("The area of the rectangle is : " + (length * width));

    }
}
