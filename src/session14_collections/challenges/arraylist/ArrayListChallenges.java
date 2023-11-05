package session14_collections.challenges.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListChallenges {
    public static void main(String[] args) {
        List<String> colors = initializeList();
        System.out.println("The color list is: " + colors);

        printListElements();
        printListAfterInsertion();
        printListElementAtIndex();
        printUpdatedList();
        printListAfterRemoval();

        boolean result = isElementInList(colors, "blue");
        System.out.println("\nThe specified element is in the list -> " + result);

        List<String> sortedList = getSortedList(colors);
        System.out.println("\nThe sorted list looks like this: " + sortedList);

        printCopiedList();

        List<String> shuffledList = getShuffledList(colors);
        System.out.println("\nThe shuffled list is: " + shuffledList);

        List<String> reversedList = getReversedList(colors);
        System.out.println("\nThe reversed list is: " + reversedList);

        List<String> partList = getPortionOfList(colors);
        System.out.println("\nApart of the original list is: " + partList);

        boolean compareResult = compareTwoLists();
        System.out.println("\nThe lists are equal = " + compareResult);

        List<String> swapped = getResultAfterSwap(colors);
        System.out.println("\nThe result after swapping two elements: " + swapped);

        printJoinedLists();

        List<String> empty = getEmptiedList(colors);
        System.out.println("\nThe empty list is: " + empty);

        boolean isListEmpty = isTheListEmpty();
        System.out.println("\nThe list is empty -> " + isListEmpty);

        printTrimListToSize();
        printIncreasedListSize();
        printClonedList();
    }

    private static void printClonedList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> cloned = (ArrayList<Integer>) numbers.clone();
        System.out.println("\nThe cloned list is: " + cloned);
    }

    private static void printIncreasedListSize() {
        ArrayList<Integer> numbers = new ArrayList<>(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        System.out.println("\nThe list: " + numbers + " has a size of  " + numbers.size());

        numbers.ensureCapacity(6);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);

        System.out.println("Now the list has a size of " + numbers.size() + " and it looks like this: " + numbers);

    }

    private static void printTrimListToSize() {
        ArrayList<Integer> numbers = new ArrayList<>(8);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.trimToSize();

        System.out.println("\nThe trimmed list: " + numbers);
    }

    private static boolean isTheListEmpty() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean isEmpty = false;

        if (numbers.isEmpty()) {
            return isEmpty = true;
        }
        return isEmpty;
    }

    private static List<String> getEmptiedList(List<String> list) {
        List<String> myList = new ArrayList<>(list);
        myList.clear();
        return myList;
    }

    private static void printJoinedLists() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> joined = new ArrayList<>();
        joined.addAll(numbers);
        joined.addAll(numberList);

        System.out.println("\nThe joined list is : " + joined);
    }

    private static List<String> getResultAfterSwap(List<String> list) {
        List<String> myList = new ArrayList<>(list);
        Collections.swap(myList, 0, 2);
        return myList;
    }

    private static boolean compareTwoLists() {
        boolean isEqual = false;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        if (numbers.equals(numberList)) {
            return isEqual = true;
        }
        return isEqual;
    }

    private static List<String> getPortionOfList(List<String> list) {
        List<String> myList = new ArrayList<>(list).subList(0, 2);
        return myList;
    }

    private static List<String> getReversedList(List<String> list) {
        List<String> myList = new ArrayList<>(list);
        Collections.reverse(myList);
        return myList;
    }

    private static List<String> getShuffledList(List<String> list) {
        List<String> myList = new ArrayList<>(list);
        Collections.shuffle(myList);
        return myList;
    }

    private static void printCopiedList() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        List<String> listWithCopies = new ArrayList<>(list);

        System.out.println("\nThe new list is: " + listWithCopies);
    }

    private static List<String> getSortedList(List<String> list) {
        List<String> myList = new ArrayList<>(list);
        Collections.sort(myList);
        return myList;
    }

    private static Boolean isElementInList(List<String> list, String value) {
        List<String> myList = new ArrayList<>(list);
        boolean isPresent = false;

        if (list.contains(value)) {
            return isPresent = true;
        }
        return isPresent;
    }

    private static void printListAfterRemoval() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.remove(2);

        System.out.println("\nAfter removing the third element, the list is: " + list);
    }

    private static void printUpdatedList() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.set(1, "orange");

        System.out.println("\nThe updated list: " + list);
    }

    private static void printListElementAtIndex() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        System.out.println("\nThe list's element at index 1 is: " + list.get(1));
    }

    private static void printListAfterInsertion() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add(0, "yellow");

        System.out.println("\n" + "\nNow the list is: " + list);
    }

    private static void printListElements() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        System.out.println("\nThe elements of the list are: ");

        for (String color : list) {
            System.out.print(color + "\t");
        }
    }

    private static List<String> initializeList() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        return list;
    }
}
