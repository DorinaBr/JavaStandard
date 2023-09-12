package session3.challenges;

import java.util.Scanner;

//Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks
public class ChallengeFourteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 and 100: ");
        int number = scanner.nextInt();

        String result = (number <=100) ? "Your number is within the given range." : "Your number should be between 1 and 100! Please, try again!" ;

        System.out.println(result);
    }
}
