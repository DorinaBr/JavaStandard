package session5_advanced_flow_control.challenges;

import java.util.Scanner;

//Ask the user to enter a string. Print the reversed version of this string
public class ChallengeFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        String reversedName = "";
        char character;

        for (int index = 0; index<name.length(); index++){
            character = name.charAt(index);
            reversedName = character + reversedName;
        }
        System.out.println("Reversed name: " + reversedName);
    }
}
