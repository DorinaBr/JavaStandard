package session13_recap.challenges.lists;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
//        printListContent();
//        printInputList();
//        printResultOfSearchingInputInAList();
//        printSortedList();
//        printListAfterRemovingElement();
//        printReversedList();
//        printListConversionToArray();
//        printMergedLists();
//        printListWithSpecifiedElements();
//        printListWithUpdatedScores();
//        printSmallestAndLargestNumberFromList();
        printShuffledList();
    }

    public static void printListContent() {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");

        for (String name : names) {
            System.out.println("The names from the list are: " + name);
        }
    }

    public static void printInputList() {
        System.out.println("Enter a number");
        int numberOne = new Scanner(System.in).nextInt();

        System.out.println("Enter another number");
        int numberTwo = new Scanner(System.in).nextInt();

        System.out.println("Enter another number");
        int numberThree = new Scanner(System.in).nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(numberOne);
        numbers.add(numberTwo);
        numbers.add(numberThree);

        System.out.println("The list with your numbers is: " + numbers);
    }

    public static void printResultOfSearchingInputInAList() {
        List<String> names = new ArrayList<>();
        names.add("Ana".toLowerCase());
        names.add("Bob".toLowerCase());
        names.add("Susie".toLowerCase());
        names.add("Tom".toLowerCase());

        System.out.println("Enter a name and let's see if we find it in the list");
        String inputName = new Scanner(System.in).next();

        if (names.contains(inputName)) {
            System.out.println("Your input name is in the list.");
        } else {
            System.out.println("Your input name is not in the given list.");
        }
    }

    public static void printSortedList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);

        Collections.sort(numbers);

        System.out.println("The sorted list looks like this: " + numbers);
    }

    public static void printListAfterRemovingElement() {
        List<String> names = new ArrayList<>();
        names.add("Ana".toLowerCase());
        names.add("Bob".toLowerCase());
        names.add("Susie".toLowerCase());
        names.add("Tom".toLowerCase());

        System.out.println("Here is the list of names: " + names);

        System.out.println("\n" + "Choose a name to be removed from the list: ");
        String inputName = new Scanner(System.in).next();

        names.remove(inputName);

        System.out.println("Now the list looks like this: " + names);
    }

    public static void printReversedList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);

        System.out.println("The list is: " + numbers);

        Collections.reverse(numbers);

        System.out.println("The reversed list is: " + numbers);
    }

    public static void printListConversionToArray() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);

        Integer[] arrayOfNumbers = numbers.toArray(numbers.toArray(new Integer[0]));

        System.out.println("The elements of the list converted to array are: ");
        for (Integer element : arrayOfNumbers) {
            System.out.print(element + "\t");
        }
    }

    public static void printMergedLists() {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Susie");

        List<String> otherNames = new ArrayList<>();
        otherNames.add("Tom");
        otherNames.add("Gina");
        otherNames.add("Jack");

        List<String> allNames = new ArrayList<>();
        allNames.addAll(names);
        allNames.addAll(otherNames);

        System.out.println("The merged lists look like this: " + allNames);
    }

    public static void printListWithSpecifiedElements() {
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");

        List<String> subList = cities.subList(1, 4);
        System.out.println("The subtraction of the given list is: " + subList);
    }

    public static void printListWithUpdatedScores() {
        List<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(85);
        scores.add(78);
        scores.add(88);
        scores.add(92);

        System.out.println("The score list is: " + scores);

        scores.set(2, 95);

        System.out.println("The updated list is: " + scores);
    }

    public static void printSmallestAndLargestNumberFromList() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        int upperbound = 30;
        int max = 0;
        int min = upperbound - 1;

        for (int index = 0; index < 7; index++) {
            int randomInt = random.nextInt(upperbound);
            randomNumbers.add(randomInt);
        }
        System.out.println("The list with random numbers: " + randomNumbers);

        for (int index = 0; index < randomNumbers.size(); index++) {
            if (randomNumbers.get(index) > max) {
                max = randomNumbers.get(index);
            } else if (randomNumbers.get(index) < min) {
                min = randomNumbers.get(index);
            }
        }

        System.out.println("the largest number in the list is: " + max);
        System.out.println("the smallest number in the list is: " + min);
    }

    public static void printShuffledList(){
        List<Integer> naturalNumbers = new ArrayList<>();
        naturalNumbers.add(0);
        naturalNumbers.add(1);
        naturalNumbers.add(2);
        naturalNumbers.add(3);
        naturalNumbers.add(4);
        naturalNumbers.add(5);
        naturalNumbers.add(6);
        naturalNumbers.add(7);
        naturalNumbers.add(8);
        naturalNumbers.add(9);

        System.out.println("The list is: " + naturalNumbers);

        Collections.shuffle(naturalNumbers);

        System.out.println("The list with shuffled numbers is: " + naturalNumbers);
    }
}
