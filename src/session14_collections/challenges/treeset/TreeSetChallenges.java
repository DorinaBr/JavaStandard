package session14_collections.challenges.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetChallenges {
    public static void main(String[] args) {
        Set<String> colors = initializeTreeSet();
        System.out.println("The TreeSet is: " + colors);

        printTreeSetElements(colors);

        Set<String> result = getNewSetFromSpecifiedSet(colors);
        System.out.println("\nThe new set is: " + result);
        Set<String> reversed = getReversedSet((TreeSet<String>) colors);
        System.out.println("The reversed set is: " + reversed);

        printFirstAndLastElement((TreeSet<String>) colors);

        TreeSet<String> cloned = getClonedSet((TreeSet<String>) colors);
        System.out.println("The cloned set is: " + cloned);

        int size = getNumberOfElements(colors);
        System.out.println("The number of elements is: " + size);

        boolean areEqual = getResultComparison(colors);
        System.out.println("The sets are equal -> " + areEqual);

        printNumbersLessThanSeven();

        int returnedValue = getGreaterThanOrEqualToGiven(4);
        System.out.println("The set element greater than or equal to given number is: " + returnedValue);

        int value = getLessThanOrEqualToGiven(3);
        System.out.println("The set element less than or equal to given number is: " + value);

        int lesser = getLessThanGiven(9);
        System.out.println("The set element less than given number is: " + lesser);

        int greater = getGreaterThanGiven(0);
        System.out.println("The set element greater than given number is: " + greater);

        printRemovedFirstElement((TreeSet<String>) colors);
        printRemovedLastElement((TreeSet<String>) colors);
        printSetAfterRemoval(4);
    }

    private static void printSetAfterRemoval(int number) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.remove(number);
        System.out.println("\nThe set after removal is: " + numbers);
    }

    private static void printRemovedLastElement(TreeSet<String> set) {
        System.out.println("\nThe set is: " + set);
        System.out.println("The lasy element to be removed : " + set.pollLast());
        System.out.println("The set after removal is: " + set);
    }

    private static void printRemovedFirstElement(TreeSet<String> set) {
        System.out.println("\nThe set is: " + set);
        System.out.println("The first element to be removed : " + set.pollFirst());
        System.out.println("The set after removal is: " + set);
    }

    private static Integer getGreaterThanGiven(Integer comparator) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        return numbers.higher(comparator);
    }

    private static Integer getLessThanGiven(Integer comparator) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        return numbers.lower(comparator);
    }

    private static Integer getLessThanOrEqualToGiven(Integer comparator) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        return numbers.floor(comparator);
    }

    private static Integer getGreaterThanOrEqualToGiven(Integer comparator) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        return numbers.ceiling(comparator);
    }

    private static void printNumbersLessThanSeven() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);

        System.out.println("Number : " + numbers.headSet(7));
    }

    private static boolean getResultComparison(Set<String> set) {
        Set<String> anotherSet = new TreeSet<>();
        anotherSet.add("blue");
        anotherSet.add("red");
        anotherSet.add("black");
        return set.equals(anotherSet);
    }

    private static int getNumberOfElements(Set<String> set) {
        return set.size();
    }

    private static TreeSet<String> getClonedSet(TreeSet<String> set) {
        return (TreeSet<String>) set.clone();
    }

    private static void printFirstAndLastElement(TreeSet<String> set) {
        System.out.println("The first element is '" + set.first() + "' and the last element is '" + set.last() + "'");
    }

    private static TreeSet<String> getReversedSet(TreeSet<String> set) {
        return (TreeSet<String>) set.descendingSet();
    }

    public static Set<String> getNewSetFromSpecifiedSet(Set<String> set) {
        Set<String> fromSpecifiedSet = new TreeSet<>(set);
        return fromSpecifiedSet;
    }

    private static void printTreeSetElements(Set<String> set) {
        System.out.print("The elements in the TreeSet are: ");
        for (String element : set) {
            System.out.print(element + "\t");
        }
    }

    private static Set<String> initializeTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("orange");
        set.add("red");
        set.add("black");

        return set;
    }
}
