package session4_operators_decision_constructs.challenges;

import java.util.Scanner;

/*Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30,
"Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.*/
public class ChallengeSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
