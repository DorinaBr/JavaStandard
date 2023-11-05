package session14_collections.challenges.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapChallenges {
    public static void main(String[] args) {
        Map<String, Integer> result = getMapWithSpecifiedValuesAndKey("apple", 5);
        System.out.println("The map is: " + result);

        int size = getMapSize(result);
        System.out.println("The map size is: " + size);

        HashMap<String, Integer> cloned = getShallowCopy((HashMap<String, Integer>) result);
        System.out.println("The cloned map is: " + cloned);

        Map<String, Integer> empty = getEmptyMap();
        System.out.println("The empty map is: " + empty);

        System.out.println("The map is empty -> " + result.isEmpty());

        Map<String, Integer> copied = getCopiedMap(result);
        System.out.println("The copied map is: " + copied);

        boolean doesContain = checkIfItContains(result, "plum");
        System.out.println("The map contains the specified key -> " + doesContain);
        boolean doesItContain = containsValueChecker(result, 5);
        System.out.println("The map contains the specified value -> " + doesItContain);

        Set set = getSetViewOfMap(result);
        System.out.println("The set view of the map is: " + set);

        Integer value = getValueOfKey(result, "apple");
        System.out.println("The value of the specified key is: " + value);

        Set keySet = getSetViewOfKeys(result);
        System.out.println("The set view of the keys is: " + keySet);

        printCollectionViewOfValues(result);
    }

    private static void printCollectionViewOfValues(Map<String, Integer> map) {
        System.out.println("The collection view of values is: " + map.values());
    }

    private static Set getSetViewOfKeys(Map<String, Integer> map) {
        return map.keySet();
    }

    private static Integer getValueOfKey(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static Set getSetViewOfMap(Map<String, Integer> map) {
        return map.entrySet();
    }

    private static boolean containsValueChecker(Map<String, Integer> map, int value) {
        return map.containsValue(value);
    }

    private static boolean checkIfItContains(Map<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    private static Map<String, Integer> getCopiedMap(Map<String, Integer> map) {
        Map<String, Integer> veggies = new HashMap<>();
        veggies.put("cucumber", 6);
        veggies.put("pepper", 2);
        veggies.putAll(map);
        return veggies;
    }

    private static Map<String, Integer> getEmptyMap() {
        Map<String, Integer> veggies = new HashMap<>();
        veggies.put("cucumber", 6);
        veggies.put("pepper", 2);
        veggies.clear();
        return veggies;
    }

    private static HashMap<String, Integer> getShallowCopy(HashMap<String, Integer> map) {
        return (HashMap<String, Integer>) map.clone();
    }

    private static int getMapSize(Map<String, Integer> map) {
        map.put("banana", 3);
        return map.size();
    }

    private static Map<String, Integer> getMapWithSpecifiedValuesAndKey(String fruit, int value) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put(fruit, value);
        return fruits;
    }
}
