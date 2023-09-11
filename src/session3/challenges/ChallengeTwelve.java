package session3.challenges;

import java.util.Scanner;

//Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
public class ChallengeTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your number: ");
        int num1 = scanner.nextInt();
        String newLine = System.lineSeparator();

        System.out.println("Incremented by 1, is: " + (++num1) + newLine + "Decrementation by 1 of the previous result: " + (--num1));
    }
}
