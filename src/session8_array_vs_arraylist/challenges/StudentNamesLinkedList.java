package session8_array_vs_arraylist.challenges;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesLinkedList {

    public static void main(String[] args) {
        List<String> studentNames = new LinkedList<>();
        studentNames.add("John");
        studentNames.add("Mary");
        studentNames.add("Dan");
        studentNames.add("Ana");
        studentNames.add("Murphy");
        studentNames.add("Joanna");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String studentNameInput = scanner.nextLine();
        scanner.close();

        if (studentNames.contains(studentNameInput)) {
            studentNames.remove(studentNameInput);
            System.out.println("The name exists in the list and it is removed. The list looks like this: " + studentNames);
        }
    }
}
