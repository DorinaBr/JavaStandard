package extra_exercices;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int to calculate it's factorial: ");
        int input = scanner.nextInt();

        getFactorial(input);
    }

    public static void getFactorial(int input) {
        int first = 1;
        int result = 0;

        for (int index = 2; index <= input; index++) {
            result = first * index;
            first = result;
        }
        System.out.println("The factorial of your input is: " + result);
    }
}
