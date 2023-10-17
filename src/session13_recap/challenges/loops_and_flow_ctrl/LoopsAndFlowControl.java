package session13_recap.challenges.loops_and_flow_ctrl;

import java.util.Scanner;

public class LoopsAndFlowControl {
    public static void main(String[] args) {
//        printResultOfEvenOrOdd();
//        printWhatDayOfWeekItIs();
//        printFactorial();
//        printPrimeOrNot();
//        printSumOfDigits();
//        printSumOfPositiveInputNumbers();
//        printFibonacciSeries(10);
//        printModifiedArray();
//        printFactorialWithPreincrementOp();
//        printPalindromeOrNot("abba");
    }

    public static void printResultOfEvenOrOdd() {
        System.out.println("Enter a number");
        int inputNumber = new Scanner(System.in).nextInt();

        if ((inputNumber % 2) == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void printWhatDayOfWeekItIs() {
        System.out.println("Enter a day of the week (starting with an uppercase letter)");
        String day = new Scanner(System.in).next();

        switch (day) {
            case "Sunday", "Saturday":
                System.out.println("It's weekend!");
                break;
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("It's a week day.");
                break;
            default:
                System.out.println("Invalid day of the week. Try again!");
                printWhatDayOfWeekItIs();
        }
    }

    public static void printFactorial() {
        System.out.println("Enter a number");
        int inputNum = new Scanner(System.in).nextInt();

        int factorial = 1;

        for (int index = 1; index <= inputNum; index++) {
            factorial = factorial * index;
        }
        System.out.println("Factorial of your number is: " + factorial);
    }

    public static void printPrimeOrNot() {
        System.out.println("Enter a number");
        int numberToBeChecked = new Scanner(System.in).nextInt();
        int num = 2;
        boolean isPrime = false;

        while (num <= numberToBeChecked/2) {
            if(numberToBeChecked% num == 0){
             isPrime = true;
                break;
            }
            num++;
        }
        if (!isPrime) {
            System.out.println("Your number is a prime number.");
        }else{
            System.out.println("Your number is not a prime number.");
        }
    }

    public static void printSumOfDigits() {
        System.out.println("Enter a number");
        int inputNumber = new Scanner(System.in).nextInt();

        int sum = 0;
        int digit;

        do {
            digit = inputNumber % 10;
            sum = sum + digit;
            inputNumber = inputNumber / 10;
        } while (inputNumber != 0);

        System.out.println("The sum of the digits is: " + sum);
    }

    public static void printSumOfPositiveInputNumbers() {
        int sum = 0;

        while (true) {
            System.out.println("Enter a number");
            int number = new Scanner(System.in).nextInt();

            if (number < 0) {
                break;
            }
            if (number > 0) {
                sum += number;
            }
        }
        System.out.println("The sum of your positive numbers is : " + sum);
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci series until" + n + " terms:");

        for (int index = 1; index <= n; ++index) {
            System.out.println(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void printModifiedArray() {
        int[] array = {1, 3, 5, 10, 11, 22};

        for (int index = 0; index < array.length; index++){
            if(index %2 == 0){
                array[index] --;
            }else{
                array[index]++;
            }
            System.out.print(array[index] + "\t");
        }
    }

    public static void printFactorialWithPreincrementOp() {
        System.out.println("Enter a number");
        int inputNum = new Scanner(System.in).nextInt();

        int factorial = 1;

        for (int index = 1; index <= inputNum; ++index) {
            factorial = factorial * index;
        }
        System.out.println("Factorial of your number is: " + factorial);
    }
    public static void printPalindromeOrNot(String word){
        int firstCharIndex = 0;
        int lastCharIndex = word.length()-1;
        word = word.toLowerCase();
        boolean isPalindrome = true;

        while (firstCharIndex<lastCharIndex){

            if (word.charAt(firstCharIndex) != word.charAt(lastCharIndex)) {
                isPalindrome = false;
                break;
            }
            firstCharIndex++;
            lastCharIndex--;
        }
        System.out.println("Is the word " + word + "  a palindrome? " + isPalindrome);
    }

}
