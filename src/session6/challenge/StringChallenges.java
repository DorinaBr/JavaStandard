package session6.challenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringChallenges {
    public static void main(String[] args) {

        printReversedString("Hello");
        printStringPalindromeChecker();
        printFullNameWithMultipleStringConcatenation();
        printInputStringWithoutVowels();
        printCapitalizeFirstLettersOfEveryWordInASentence();
        printReplacedWordInASentence();
        printResultAfterRemovingDuplicateCharacters();
        printResultOfInsertedStringIntoAnotherString();
        printFrequencyCharacterInString();
    }

    public static void printReversedString(String greeting) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(greeting);

        System.out.println("'Hello' reversed is: " + stringBuilder.reverse());
    }

    public static void printStringPalindromeChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + " Enter a word and let's check if it's a palindrome: ");
        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(input);

        StringBuilder reversedWord = stringBuilder.reverse();
        System.out.println("\n" + "The reversed word is: " + reversedWord);

        if (reversedWord.toString().equals(input)) {
            System.out.println("The word " + input + " is a palindrome!");
        } else {
            System.out.println("The word " + input + " is not a palindrome!");
        }
    }

    public static void printFullNameWithMultipleStringConcatenation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Please enter your first name: ");
        String firstName = scanner.next();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();

        System.out.println("Please enter your name suffix ('Jr.', 'Sr.', 'I' etc): ");
        String nameSuffix = scanner.next();

        List<String> stringList = new ArrayList<>();
        stringList.add(firstName);
        stringList.add(lastName);
        stringList.add(nameSuffix);
        StringBuilder fullName = new StringBuilder();

        for (String index : stringList) {

            fullName.append(index).append(" ");
        }
        System.out.println("\n" + "Your full name is: " + fullName);
    }


    public static void printInputStringWithoutVowels() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Type a word: ");
        String input = scanner.next();

        StringBuilder wordWithoutVowels = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {

            if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(index) == 'u') {
                continue;

            } else {
                wordWithoutVowels.append(input.charAt(index));
            }
        }
        System.out.println("The word without vowels is: " + wordWithoutVowels);
    }

    private static void printCapitalizeFirstLettersOfEveryWordInASentence() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Please write a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String newWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            result.append(newWord).append(" ");
        }
        System.out.println("\n" + "Now the sentence looks like this: " + result);
    }

    public static void printReplacedWordInASentence() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Please write a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("What word would you like to be replaced?: ");
        String wordToBeReplaced = scanner.next();

        System.out.println("Write the new word to be put in your sentence: ");
        String newWord = scanner.next();

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words)
            if (wordToBeReplaced.equals(word)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        System.out.println("Now your sentence looks like this: " + result);
    }

    public static void printResultAfterRemovingDuplicateCharacters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Enter your word: ");
        String input = scanner.next();
        char[] characters = input.toCharArray();


        StringBuilder wordWithoutDuplicates = new StringBuilder();

        for (char character : characters) {
            String charToString = Character.toString(character);

            if (!wordWithoutDuplicates.toString().contains(charToString)) {

                wordWithoutDuplicates.append(charToString);
            }
        }
        System.out.println("Your word without duplicate characters is: " + wordWithoutDuplicates);
    }

    public static void printResultOfInsertedStringIntoAnotherString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.println("Write a word to be inserted in your sentence: ");
        String inputWord = scanner.next();

        System.out.println("Enter a number to represent the position in which the word will be put: ");
        int inputIndex = scanner.nextInt();

        String[] splitSentence = inputSentence.split(" ");
        List<String> convertedArray = Arrays.asList(splitSentence);

        while (inputIndex > splitSentence.length) {
            System.out.println("Enter another number: ");
            inputIndex = scanner.nextInt();
        }
        StringBuilder result = new StringBuilder();

        for (String element : splitSentence) {
            if (inputIndex == convertedArray.indexOf(element)) {
                result.append(inputWord).append(" ");
            }
            result.append(element).append(" ");
        }
        if (inputIndex == splitSentence.length) {
            result.append(inputWord).append(" ");
        }
        System.out.println("The result is: " + result);
    }

    public static void printFrequencyCharacterInString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a word: ");
        String userInput = scanner.nextLine();
        StringBuilder alreadyPrintedChar = new StringBuilder();

        for (int index = 0; index < userInput.length(); index++) {
            char character = userInput.charAt(index);
            int frequency = 1;

            String charToString = Character.toString(character);

            if (alreadyPrintedChar.toString().contains(charToString)) {
                continue;
            }

            for (int indexOfRemainder = index + 1; indexOfRemainder < userInput.length(); indexOfRemainder++) {
                char anotherChar = userInput.charAt(indexOfRemainder);

                if (character == anotherChar) {
                    frequency += 1;
                }
            }

            System.out.println(character + " = " + frequency);

            alreadyPrintedChar.append(charToString);
        }
    }
}









