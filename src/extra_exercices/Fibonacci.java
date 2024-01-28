package extra_exercices;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int which represents the first numbers of the fibonacci series:");
        int input = scanner.nextInt();

        printFibonacci(input);

    }

    public static void printFibonacci(int input) {

        int current;
        int first = 0;
        int second = 1;

        System.out.println("The first " + input + " numbers of fibonacci series are: ");
        for (int index = 0; index < input; index++) {

            current = first;
            first = second;
            second = current + first;
            System.out.print(current + " ");
        }
    }
}
