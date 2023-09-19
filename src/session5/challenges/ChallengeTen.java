package session5.challenges;
/*Create a menu-driven program where the user is presented with options:
        Print "Hello World"
        Print the user's name.
        Exit.
        Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option.
        Use jump statements to control the flow of the program.*/

import java.util.Scanner;

public class ChallengeTen {
    public static void main(String[] args) {

        System.out.println("Your options are: ");
        System.out.println("Print 'Hello World.");
        System.out.println("Print user name.");
        System.out.println("Exit.");
        int option;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n" + "Which option would you prefer? ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Hello World!");
                    break;
                case 2:
                    System.out.println("User name.");
                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("There is no such option.Try again!");
            }
            System.out.println();
            System.out.println("Your options are: ");
            System.out.println("Print 'Hello World.");
            System.out.println("Print user name.");
            System.out.println("Exit.");

        } while (option != 3);
    }
}
