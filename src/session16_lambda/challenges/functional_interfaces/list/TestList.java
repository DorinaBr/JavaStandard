package session16_lambda.challenges.functional_interfaces.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Integer> oddList = new ArrayList<>();

        IntegerListProcessor oddElements = inputList -> {
            inputList.forEach(integer -> {
                if (integer % 2 != 0)
                    oddList.add(integer);
            });
            return oddList;
        };
        System.out.println("The list with odd elements is: " + oddElements.process(Arrays.asList(1, 4, 7, 10, 11)));

        StringListProcessor uppercaseNames = stringList -> {
            stringList.replaceAll(String::toUpperCase);
            return stringList;
        };
        System.out.println("The list with uppercase names is: " + uppercaseNames.format(Arrays.asList("ana","bob","tom")));
    }
}
