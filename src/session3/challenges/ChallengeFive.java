package session3.challenges;

import java.util.Scanner;

//Create a Java program that demonstrates the use of each compound assignment operator with integers.
public class ChallengeFive {
    public static void main(String[] args) {
        int numberOne = 5;
        int numberTwo;
        numberTwo = numberOne;
        System.out.println(numberTwo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Type your first number: ");
        int firstInput = scanner.nextInt();
        System.out.println("Now type your second number: ");
        int secondInput = scanner.nextInt();
        String newline = System.lineSeparator();

        System.out.println("+= : " + (firstInput += secondInput) + newline + "-= : " + (firstInput -= secondInput) + newline + "*= : " + (firstInput *= secondInput));
        System.out.println("/= : " + (firstInput /= secondInput) + newline + "%= : " + (firstInput %= secondInput));
    }
}
