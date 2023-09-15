package session4.challenges;

import java.util.ArrayList;

/*Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
 Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
 Print both lists and observe the output.*/
public class ChallengeTen {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();

        listOne.add("Ana");
        listOne.add("Peter");
        listOne.add("John");
        listOne.add("Mary");
        System.out.println(listOne);

        ArrayList<String> listTwo = listOne; //When we modify the first list we also modify the second one because they are one and the same.
        System.out.println(listTwo);
    }
}
