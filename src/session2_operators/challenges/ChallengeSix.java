package session2_operators.challenges;

import java.util.Scanner;

//Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than,
// less than, or equal to the second number.
public class ChallengeSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Type your first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Now type your second number: ");
        int number2 = scanner.nextInt();

        String newLine = System.lineSeparator();

        System.out.println("First number == second number: " + (number1 == number2) + newLine + "First number != second number: " + (number1 != number2));
        System.out.println("First number > second number: " + (number1 > number2) + newLine + "First number < second number: " + (number1 < number2));
        System.out.println("First number >= second number: " + (number1 >= number2) + newLine + "First number <= second number: " + (number1 <= number2));
    }

}
