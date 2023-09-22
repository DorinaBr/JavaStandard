package remus;


import java.util.Scanner;

/*
2. Palindrome Checker
Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder secondHalf = new StringBuilder();

        System.out.println("Enter a string:");
        String input = scanner.next();
        float inputLength = input.length();

        for (int i = input.length() - 1; i >= Math.ceil(inputLength / 2); i--) {
            secondHalf.append(input.charAt(i));
        }

        boolean isPalindrome = input.substring(0, input.length() / 2).contentEquals(secondHalf);
        if (isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
