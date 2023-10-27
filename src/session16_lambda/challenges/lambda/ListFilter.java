package session16_lambda.challenges.lambda;

import java.util.Arrays;
import java.util.List;

public class ListFilter {

    public static void main(String[] args) {
        printEven(Arrays.asList(1, 4, 8, 11, 22, 25));

        List<String> sorted = getSortedList(Arrays.asList("apple", "pear", "plum", "banana"));
        System.out.println("\nThe sorted list is: " + sorted);

        Integer sumOfElements = getSum(Arrays.asList(2, 3, 5, 7));
        System.out.println("The sum of the list numbers is: " + sumOfElements);

        List<String> reversed = getReversedOrder(Arrays.asList("pen", "book", "notebook", "marker"));
        System.out.println("The reversed list is: " + reversed);
    }

    private static void printEven(List<Integer> integers) {
        System.out.println("The list even numbers are: ");
        integers.forEach(integer -> {
            if (integer % 2 == 0) {
                System.out.print("\t" + integer);
            }
        });
    }

    private static List<String> getSortedList(List<String> stringList) {
        stringList.sort(String::compareTo);
        stringList.sort(((o1, o2) -> o2.compareTo(o1)));
        return stringList;
    }

    private static Integer getSum(List<Integer> integerList) {
        final Integer[] sum = {0};
        integerList.forEach(integer -> sum[0] = sum[0] + integer);
        return sum[0];
    }

    private static List<String> getReversedOrder(List<String> words){
        words.sort(((o1, o2) -> o2.compareTo(o1)));
        return words;
    }
}
