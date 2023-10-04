package session5_advanced_flow_control.challenges;

import java.util.Scanner;

/*Write a program that asks the user to enter numbers.
The program should continue prompting the user until they enter -1.
After they enter -1, print the sum of all numbers entered (excluding -1).*/
public class ChallengeSix {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        while (number != -1) {
            sum += number;
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
