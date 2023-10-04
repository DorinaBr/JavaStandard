package session8_array_vs_arraylist.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");

        names.add(1, "Frank");

        System.out.println(names);

        if(names.isEmpty()){
            System.out.println("names is empty");
        }else{
            System.out.println("names list is not empty; size: " + names.size());
        }

        String firstElement = names.get(0);
        System.out.println("First element from names is: " + firstElement);
    }
}
