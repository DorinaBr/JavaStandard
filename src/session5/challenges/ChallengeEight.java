package session5.challenges;

//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
public class ChallengeEight {
    public static void main(String[] args) {
        int limit = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("The first 10 numbers of Fibonacci Series are: ");

        for (int index = 1; index <= limit; index++) {
            System.out.print(firstNumber + " \t");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
