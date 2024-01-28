package extra_exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeConstruct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input1 = scanner.nextLine();

        Map<Character, Integer> chars = getCharCount(input1);
        System.out.println("The character count of your input is: " + chars);

        String result = getPalindrome(chars);
        System.out.println("Result of trying to make a palindrome out of your input: " + result);

        boolean isPalindrome = isPalindrome(result);
        System.out.println("Your input is a palindrome = " + isPalindrome);
    }

    private static Map<Character, Integer> getCharCount(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int index = 0; index < input.length(); index++) {
            char current = input.charAt(index);

            if (!charCount.containsKey(current)) {
                charCount.put(current, 1);
            } else {
                charCount.put(current, charCount.get(current) + 1);
            }
        }
        return charCount;
    }

    private static String getPalindrome(Map<Character, Integer> chars) {
        StringBuilder result = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        for (Character c : chars.keySet()) {
            for (int index = 0; index < chars.get(c) / 2; index++) {
                reversed.append(c);
            }
        }
        result.append(reversed);

        if (chars.values().stream().anyMatch(c -> c % 2 != 0)) {
            for (Character c : chars.keySet()) {
                if (chars.get(c) % 2 != 0) {
                    result.append(c);
                }
            }
        }
        result.append(reversed.reverse());

        return result.toString();
    }

    private static Boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.contentEquals(stringBuilder.reverse());
    }
}

