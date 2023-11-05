package session18_another_recap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem4 {
    //    Given a List of strings, find which strings have duplicates and how many duplicates each string has.
//    Store this information in a HashMap where the key is the string and the value is the count of occurrences. Print the resulting map.
    public static void main(String[] args) {
        List<String> pets = Arrays.asList("dog", "cat", "dog", "duck", "cat");
        Map<String, Long> duplicate = findDuplicates(pets);

        duplicate.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static Map<String, Long> findDuplicates(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
