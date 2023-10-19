package session14_collections.challenges.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListChallenges {

    public static void main(String[] args) {
        List<Integer> list = getListAfterAppend(2);
        System.out.println("The list is: " + list);

        printListElements();
        printIterateFromSpecification();
        printIterationReversed();
        printListAfterInsertion();
        printFirstAndLastOccurrence();
        printElementsAndPosition();

        List<String> result = getListAfterElementRemoval("Tom");
        System.out.println("\nThe list after element removal is: " + result);

        printListAfterRemoval();

        List<String> empty = getEmptyLinkedList();
        System.out.println("Empty list: " + empty);

        printListAfterSwap();

        List<String> shuffled = getShuffledLinkedList();
        System.out.println("\nThe shuffled list is: " + shuffled);

        printJoinedLinkedLists();

        List<Integer> clonedList = getClonedLinkedList();
        System.out.println("\nThe cloned list is: " + clonedList);

        printFirstElement();

        int firstElem = getFirstElement();
        System.out.println("\nThe first element of the list is: " + firstElem);

    }

    private static int getFirstElement(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        return numbers.getFirst();
    }

    private static void printFirstElement(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("\nThe first element of the list is: " + numbers.getFirst());

        numbers.removeFirst();

        System.out.println("The list without the first element: " + numbers);
    }

    private static LinkedList<Integer> getClonedLinkedList(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return  (LinkedList<Integer>) numbers.clone();
    }

    private static void printJoinedLinkedLists(){
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> numberList = new LinkedList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> joined = new LinkedList<>();
        joined.addAll(numbers);
        joined.addAll(numberList);
        System.out.println("\nThe joined list is: " + joined);
    }

    private static LinkedList<String> getShuffledLinkedList(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");
        names.add("John");

        Collections.shuffle(names);
        return names;
    }

    private static void printListAfterSwap(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");
        names.add("John");

        Collections.swap(names,2,0);

        System.out.println("\nAfter swapping element at index 2 with element at index 0, the list is: " + names);
    }

    private static LinkedList<String> getEmptyLinkedList(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");
        names.add("John");

        names.clear();
        return names;
    }

    private static void printListAfterRemoval() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");
        names.add("John");

        names.removeFirst();
        names.removeLast();
        System.out.println("\nThe list after removing first and last element is: " + names);
    }

    private static LinkedList<String> getListAfterElementRemoval(String name) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");

        names.remove(name);
        return names;
    }

    private static void printElementsAndPosition() {
        List<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");

        for (int index = 0; index < names.size(); index++) {
            System.out.println("\nElement at index " + index + " : " + names.get(index));
        }
    }

    private static void printFirstAndLastOccurrence() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");

        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("\nThe first occurrence is " + first + " and the last is " + last);
    }

    private static void printListAfterInsertion() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Bob");
        names.add("Tom");

        names.add(0, "George");
        System.out.println("\nThe name list after insertion at index 0 is: " + names);

        names.addFirst("Susie");
        names.addLast("Noah");
        System.out.println("\nInserted elements at the first and last position: " + names);

        names.add("Lenna");
        System.out.println("\nInserted element at the end of the list : " + names);

        names.add(0, "John");
        names.add(0, "Angel");
        System.out.println("\nInserted 2 elements at index 0 in the list : " + names);
    }

    private static void printIterationReversed() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator iterator = numbers.descendingIterator();
        System.out.print("\nList iteration in reversed order : ");
        while (iterator.hasNext()) {
            System.out.print("\t" + iterator.next());
        }
    }

    private static void printIterateFromSpecification() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator iterator = numbers.listIterator(2);

        System.out.print("\nList iteration starting at 3rd position: ");
        while (iterator.hasNext()) {
            System.out.print("\t" + iterator.next());
        }
    }

    private static void printListElements() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.print("The list elements are: ");

        for (int number : numbers) {
            System.out.print("\t" + number );
        }
    }

    private static List<Integer> getListAfterAppend(int number) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(number);
        return numbers;
    }
}
