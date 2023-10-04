package session5_advanced_flow_control.challenges;

import java.util.Scanner;

/*Create a program where the user is prompted to guess a predefined number.
After each guess, the program should inform the user if the guess is too high or too low.
The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.*/
public class ChallengeSeven {
    public static void main(String[] args) {
        int predefinedNumber = 5;

        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("Guess the number: ");
            inputNumber = scanner.nextInt();

            if (inputNumber > predefinedNumber) {
                System.out.println("Too high.");
            } else if (inputNumber < predefinedNumber) {
                System.out.println("Too low.");
            }

        } while (inputNumber != predefinedNumber);

        System.out.println("You guessed the number.");
    }
}
