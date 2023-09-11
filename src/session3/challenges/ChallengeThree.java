package session3.challenges;


import java.util.Scanner;

//Write a program to check if a number is positive or negative using logical complement operator.
public class ChallengeThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Type your first number: ");
        int number = scanner.nextInt();


if (number >=0)
    System.out.println("The number is positive" );
else
    System.out.println("The number is negative" );

    }
}
