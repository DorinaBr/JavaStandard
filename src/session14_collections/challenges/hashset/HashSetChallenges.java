package session14_collections.challenges.hashset;

import java.util.*;

public class HashSetChallenges {
    public static void main(String[] args) {
        Set<Integer> result = getSetWithNewElem(5);
        System.out.println("The set is: " + result);

        printSetElements();

        int elementNumber = getSetNumberElements();
        System.out.println("\nNumber of elements in the set is: " + elementNumber);

        printEmptySet();

        boolean emptyOrNot = isSetEmpty();
        System.out.println("The set is empty -> " + emptyOrNot);

        printClonedSet();
        printSetToArray();
        printSetToTree();
        printSetToList();

        boolean areEqual = getResultSetComparison();
        System.out.println("The sets are equal -> " + areEqual);

        printSameElements();
        printSetAfterRemoval();
    }

    private static void printSetAfterRemoval(){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.removeAll(numbers);
        System.out.println("\nThe empty set: " + numbers);
    }

    private static void printSameElements(){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("\nFirst set content : " + numbers);

        Set<Integer> otherNumbers = new HashSet<>();
        otherNumbers.add(1);
        otherNumbers.add(2);
        otherNumbers.add(5);
        otherNumbers.add(6);
        System.out.println("Second set content: " + otherNumbers);

        numbers.retainAll(otherNumbers);
        System.out.println("The same elements from both sets are: " + numbers);
    }

    private static boolean getResultSetComparison(){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Set<Integer> otherNumbers = new HashSet<>();
        otherNumbers.add(1);
        otherNumbers.add(2);
        otherNumbers.add(3);
        otherNumbers.add(4);

        return numbers.equals(otherNumbers);
    }

    private static void printSetToList() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> convertedSet = new ArrayList<>(numbers);
        System.out.println("The converted set to list is: " + convertedSet);
    }

    private static void printSetToTree() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Set<Integer> setToTree = new TreeSet<>(numbers);
        System.out.println("\nThe HashSet converted to TreeSet is: " + setToTree);
    }

    private static void printSetToArray() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Integer[] converted = numbers.toArray(new Integer[numbers.size()]);

        System.out.print("The set converted to array is: ");
        for (int number : converted) {
            System.out.print(number + "\t");
        }
    }

    private static void printClonedSet() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        HashSet<Integer> cloned = (HashSet<Integer>) numbers.clone();
        System.out.println("The cloned set is: " + cloned);
    }

    private static boolean isSetEmpty() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        boolean isEmpty = numbers.isEmpty();

        return isEmpty;
    }

    private static void printEmptySet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.clear();

        System.out.println("The empty set: " + numbers);
    }

    private static int getSetNumberElements() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        return numbers.size();
    }

    private static void printSetElements() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.print("The elements in the set are: ");

        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

    private static Set<Integer> getSetWithNewElem(int number) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(number);
        return numbers;
    }
}
