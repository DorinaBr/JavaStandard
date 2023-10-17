package session13_recap.practice;

import java.util.Scanner;

public class StringFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        String result = String.format("%s is %d years old", name, age);
        System.out.println(result);
    }
}
