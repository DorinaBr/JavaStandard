package session5.challenges;
//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

import java.util.Scanner;

public class ChallengeFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        int FibonacciLength = scanner.nextInt();

        int[] number = new int[FibonacciLength];
        number[0] = 0;
        number[1] = 1;

        for (int index = 2; index < FibonacciLength; index++) {
            number[index] = number[index - 1] + number[index - 2];
        }
        System.out.println("Fibonacci series: ");
        System.out.println();

        for (int index = 0; index < FibonacciLength; index++) {
            System.out.print(number[index] + " ");
        }
    }
}
