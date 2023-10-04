package session5_advanced_flow_control.challenges;
/*Even or Odd Checker
         Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".*/

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
