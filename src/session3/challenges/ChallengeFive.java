package session3.challenges;

import java.util.Scanner;

//Create a Java program that demonstrates the use of each compound assignment operator with integers.
public class ChallengeFive {
    public static void main(String[] args) {
        int num1 = 5;
        int num2;
        num2 = num1;
        System.out.println(num2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Type your first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Now type your second number: ");
        int numberTwo = scanner.nextInt();
        String newline = System.lineSeparator();

        System.out.println("+= : " + (numberOne+=numberTwo) + newline + "-= : " + (numberOne-=numberTwo) + newline + "*= : " + (numberOne *=numberTwo));
        System.out.println( "/= : " + (numberOne/=numberTwo) + newline + "%= : " + (numberOne%=numberTwo));
    }
}
