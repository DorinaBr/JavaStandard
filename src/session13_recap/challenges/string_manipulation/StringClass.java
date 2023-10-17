package session13_recap.challenges.string_manipulation;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
//        printStringLength();
//        printStringConcatenation();
//        printSubstring();
//        printResultToStringComparison();
//        printResultToCharReplacement();
//        printResultAfterFormatting();
        printResultAfterWordReplacement();
    }

    private static String getWord(String Enter_a_word) {
        System.out.println(Enter_a_word);
        String word = new Scanner(System.in).next();
        return word;
    }

    public static void printStringLength() {
        String word = getWord("Enter a word");

        System.out.println("Your word's length is: " + word.length());
    }

    public static void printStringConcatenation() {
        String word = getWord("Enter a word");

        String anotherWord = getWord("Enter another word");

        String result = word + anotherWord;
        System.out.println("The concatenation of your words is: " + result);
    }

    public static void printSubstring() {
        String word = getWord("Enter a word");

        System.out.println("The extracted substring from your word is: " + word.substring(0, 2));
    }

    public static void printResultToStringComparison(){
        String word = getWord("Enter a word");
        String anotherWord = getWord("Enter another word");

        System.out.println("Are your word equal? " + word.equals(anotherWord));
    }

    public static void printResultToCharReplacement(){
        String word = getWord("Enter a word");

        String replaced = word.toLowerCase().replaceAll("a","e");
        System.out.println("When 'a' is replaced with 'e', the result is:  " + replaced);
    }

    public static void printResultAfterFormatting(){
        String name = getWord("Enter a name");

        System.out.println("Enter an age");
        int age = new Scanner(System.in).nextInt();

        String result = String.format("%s is %d years old.", name, age);

        System.out.print(result);
    }

    public static void printResultAfterWordReplacement(){
        System.out.println("Enter a sentence with the word apple in it.");
        String sentence = new Scanner(System.in).nextLine();

        String replacedSentence = sentence.toLowerCase().replaceAll("apple", "orange");
        System.out.println("Your sentence with 'orange' instead of 'apple': " + replacedSentence);
    }
}
