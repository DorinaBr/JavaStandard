package session17_streams.challenges;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamsChallenges {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Integer> oneToOneHundred = getListOfOneHundred();
        List<Person> personList = Arrays.asList(new Person("Tom", "Ford", 20),
                new Person("Alice", "Wonderland", 17),
                new Person("Candy", "Cane", 23));
        List<String> sentences = Arrays.asList("Hello world", "Hello Everyone", "Welcome to the World of Java");
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        printEvenNumbers(numbers);
        printLongestString(fruits);

        List<Integer> primeNumbers = oneToOneHundred.stream()
                .filter(StreamsChallenges::isPrime)
                .toList();

        System.out.println("The prime numbers list is: " + primeNumbers);

        String result = getListAsString();
        System.out.println("The concatenated strings are: " + result);

        List<Person> olderThan18 = personList.stream()
                .filter(person -> person.getAge() > 18)
                .toList();
        System.out.println("The list of people older than 18 is: " + olderThan18);

        Integer sum = getSum(numbers);
        System.out.println("The sum of all list elements is: " + sum);

        List<Integer> lengthsList = getLengthList(fruits);
        System.out.println("The list of fruit lengths is: " + lengthsList);

        int numberOfVowels = getNumberOfVowels();
        System.out.println("The number of vowels in the sentence is: " + numberOfVowels);

        List<String> sentenceToWords = getWordsList(sentences);
        System.out.println("The sentence list to words list : " + sentenceToWords);

        printMostFrequent(sentenceToWords);

        long numberOfChars = getNumberOfChars(strings);
        System.out.println("The number of chars in the sentence list is : " + numberOfChars);

        int sumOfParsedStrings = getSumOfParsedStrings();
        System.out.println("The sum of parsed strings is : " + sumOfParsedStrings);
    }

    private static int getSumOfParsedStrings() {
        List<String> numbersAsStr = Arrays.asList("1", "2", "3", "4", "5");

        return numbersAsStr.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }

    private static int getNumberOfChars(List<String> stringList) {
        return stringList.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .map(String::length)
                .reduce(0, Integer::sum);
    }

    private static void printMostFrequent(List<String> stringList) {
        Map<String, Long> occurrences = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("The most frequent word is : " + Collections.max(occurrences.entrySet(), Map.Entry.comparingByValue()).getKey());
    }

    private static List<String> getWordsList(List<String> stringList) {
        return stringList.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .toList();
    }

    private static int getNumberOfVowels() {
        String sentence = "Hello World";
        List<String> listOfVowels = Arrays.asList("A", "a", "e", "E", "I", "i", "O", "o", "U", "u");

        return (int) Arrays.stream(sentence.split(""))
                .filter(listOfVowels::contains)
                .count();
    }

    private static List<Integer> getLengthList(List<String> stringList) {
        return stringList.stream()
                .map(String::length)
                .toList();
    }

    private static Integer getSum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }

    private static String getListAsString() {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        StringBuilder concatenated = new StringBuilder();
        strings.forEach(string -> concatenated.append(string).append(", "));
        return concatenated.toString();
    }

    private static boolean isPrime(int toCheck) {
        for (int divisor = 2; divisor <= Math.sqrt(toCheck); divisor++) {
            if (toCheck % divisor == 0)
                return false;
        }
        return true;
    }

    private static List<Integer> getListOfOneHundred() {
        return IntStream.rangeClosed(1, 100).boxed().toList();
    }

    private static void printLongestString(List<String> strings) {
        String longest = strings.stream()
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println("The longest string of fruit list is: " + longest);
    }

    private static void printEvenNumbers(List<Integer> list) {
        List<Integer> newList = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("The even number list is: " + newList);
    }
}
