package session4_operators_decision_constructs.challenges;

import java.util.Scanner;

/*Write a Java program that takes an integer variable age as input.
 Use a ternary operator to classify the person into one of the following categories:
 "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above).
 Print the resulting classification.*/
public class ChallengeEighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String result = (age < 12) ? "Child" : (age <= 17) ? "Teenager" : (age <= 64) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
