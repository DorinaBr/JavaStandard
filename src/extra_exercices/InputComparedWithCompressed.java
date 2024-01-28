package extra_exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputComparedWithCompressed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input1 = scanner.nextLine();

        Map<Character, Integer> chars = getCharCount(input1);
        System.out.println("The character count of your input is: " + chars);

        String compressed = getCompressedString(chars);

        if (compressed.length() < input1.length()) {
            System.out.println("The compressed string " + compressed + " is smaller than your input.");
        } else {
            System.out.println(input1 +  " >= " + compressed );
        }
    }

    private static String getCompressedString(Map<Character, Integer> charCount) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            stringBuilder.append(entry.getKey()).append(entry.getValue());
        }

        return stringBuilder.toString();
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
}
