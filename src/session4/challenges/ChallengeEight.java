package session4.challenges;

/*Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it.
 Then calculate and print the factorial of number.*/
public class ChallengeEight {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of 5 is: " + factorial);
    }
}
