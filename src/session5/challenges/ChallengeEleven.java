package session5.challenges;

import java.util.Scanner;

/*Write a program that prompts the user to enter numbers.
Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.*/
public class ChallengeEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average;
        int count = 0;
        int input;

        while (true) {
            System.out.println("Enter a number: ");
            input = scanner.nextInt();

            sum += input;
            count = count + 1;

            if (input == 0) {
                break;
            }
        }

        average = sum / count;
        System.out.println("The average is: " + average);
    }
}
