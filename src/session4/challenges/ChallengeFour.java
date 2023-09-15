package session4.challenges;
/*Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
 Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.*/

import java.util.Scanner;

public class ChallengeFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a height value(cm): ");
        int heightOne = scanner.nextInt();

        System.out.println("Enter another height value(cm): ");
        int heightTwo = scanner.nextInt();

        String result = (heightOne > heightTwo) ? "The first height value is greater than the second one." : "The second height value is greater than the first one.";
        System.out.println(result);
    }
}
