package session16_lambda.challenges.functional_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ListFilter listFilter = (listT, predicate) -> listT.stream().filter(predicate).toList();
        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        List evenNumbers = listFilter.filter(numbers, isEven);
        System.out.println("The filtered list is: " + evenNumbers);
    }
}
