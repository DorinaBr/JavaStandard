package session14_collections.challenges.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapChallenges {
    public static void main(String[] args) {
        Map<Integer, String> colors = getMap(1, "red");
        System.out.println("The map is: " + colors);

        Map<Integer, String> copied = getCopiedMap(colors);
        System.out.println("The map is: " + copied);

        boolean contains = searchKeyResult(copied, 2);
        System.out.println("The map contains the specified key -> " + contains);

        boolean result = searchValueResult(copied, "black");
        System.out.println("The map contains the specified value: -> " + result);

        Set<Integer> keys = getMapKeys(copied);
        System.out.println("The map's keys are: " + keys);

        Map<Integer, String> empty = getEmptyMap(copied);
        System.out.println("The empty map is: " + empty);

        TreeMap<Integer, String> names = new TreeMap<>(new SortKey());
        names.put(1, "Ana");
        names.put(3, "Susie");
        names.put(2, "John");
        System.out.println("The sorted map is: " + names);

        printGreatestAndLeast(names);
        printLowestAndHighestKey(names);

        Set<Integer> reversed = getReversedOrder(names);
        System.out.println("The map keys in reversed order are: " + reversed);

        printLessThanOrEqualToGiven(names, 3);
        printGreaterThanOrEqualToGiven(names, 1);

        Integer lessOrEqual = getGreatestKeyLessThanOrEqualToGiven(names, 2);
        System.out.println("The key is: " + lessOrEqual);

        printMapKeysStrictlyLessThanGiven(names, 2);
        printMapKeysLessThanOrEqualThanGiven(names, 3);

        printStrictlyGreaterKey(names, 3);

        Integer less = getStrictlyLess(names, 1);
        System.out.println("The strictly less key is: " + less);

        Integer greatest = getStrictlyGreater(names, 1);
        System.out.println("The strictly greater key is: " + greatest);
    }

    private static Integer getStrictlyGreater(TreeMap<Integer, String> map, Integer key) {
        return map.higherKey(key);
    }

    private static Integer getStrictlyLess(TreeMap<Integer, String> map, Integer key) {
        return map.lowerKey(key);
    }

    private static void printStrictlyGreaterKey(TreeMap<Integer, String> map, Integer key) {
        System.out.println("The strictly greater key is: " + map.higherEntry(key));
    }

    private static void printMapKeysLessThanOrEqualThanGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println("The portion of the map with keys less than or equal to given is: " + map.headMap(key));
    }

    private static void printMapKeysStrictlyLessThanGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println("The portion of the map with keys strictly less than given is: " + map.headMap(key));
    }

    private static Integer getGreatestKeyLessThanOrEqualToGiven(TreeMap<Integer, String> map, Integer key) {
        return map.floorKey(key);
    }

    private static void printGreaterThanOrEqualToGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println("The key-value pair greater than or equal to given key is: " + map.ceilingEntry(key));
    }

    private static void printLessThanOrEqualToGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println("The key-value pair less than or equal to given key is: " + map.floorEntry(key));
    }

    private static Set<Integer> getReversedOrder(TreeMap<Integer, String> map) {
        return map.descendingKeySet();
    }

    private static void printLowestAndHighestKey(TreeMap<Integer, String> map) {
        System.out.println("Greates key is: " + map.firstKey());
        System.out.println("Least key is: " + map.lastKey());

    }

    private static void printGreatestAndLeast(TreeMap<Integer, String> map) {
        System.out.println("Greates key is: " + map.firstEntry());
        System.out.println("Least key is: " + map.lastEntry());
    }

    private static Map<Integer, String> getEmptyMap(Map<Integer, String> map) {
        map.clear();
        return map;
    }

    private static Set<Integer> getMapKeys(Map<Integer, String> map) {
        return map.keySet();
    }

    private static boolean searchValueResult(Map<Integer, String> map, String value) {
        return map.containsValue(value);
    }

    private static boolean searchKeyResult(Map<Integer, String> map, Integer key) {
        return map.containsKey(key);
    }

    private static Map<Integer, String> getCopiedMap(Map<Integer, String> map) {
        Map<Integer, String> otherColors = new TreeMap<>();
        otherColors.put(2, "blue");
        otherColors.put(3, "green");
        otherColors.putAll(map);
        return otherColors;
    }

    private static Map<Integer, String> getMap(Integer key, String value) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(key, value);
        return map;
    }

    static class SortKey implements Comparator<Integer> {
        @Override
        public int compare(Integer key1, Integer key2) {
            return key1.compareTo(key2);
        }
    }
}
