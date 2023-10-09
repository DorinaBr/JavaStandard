package session8_array_vs_arraylist.challenges;

import java.util.ArrayList;
import java.util.List;

public class FruitSorting {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("pineapple");
        fruits.add("cherry");
        fruits.add("grapes");

        List<String> sortedFruits = new ArrayList<>();

        WrappingFor:
        for (int index = 0; index < fruits.size(); index++) {
            String fruitToAdd = fruits.get(index);
            for (int index2 = 0; index2 < sortedFruits.size(); index2++) {
                String fruitToCompareTo = sortedFruits.get(index2);

                if (fruitToAdd.length() > fruitToCompareTo.length() || (fruitToAdd.length() == fruitToCompareTo.length() && fruitToAdd.compareTo(fruitToCompareTo) >= 0)) {
                    sortedFruits.add(index2, fruitToAdd);
                    continue WrappingFor;
                }
            }

            sortedFruits.add(fruitToAdd);
        }

        System.out.println("The sorted fruits list looks like this: " + sortedFruits);
    }
}
