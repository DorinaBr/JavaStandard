package session4.challenges;

import java.util.Scanner;
/* Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
 Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".*/
public class ChallengeSeven {
    public static void main(String[] args) {
        System.out.println("Find out what type of triangle it is!");

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the first side: ");
        int sideOne = scanner.nextInt();

        System.out.println("Enter the value of the second side: ");
        int sideTwo = scanner.nextInt();

        System.out.println("Enter the value of the third side: ");
        int sideThree = scanner.nextInt();


        boolean isEquilateral = sideOne == sideTwo && sideOne == sideThree;
        boolean isIsosceles = sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree;
        String result1 =
                isEquilateral ?
                "Equilateral" :
                isIsosceles ?
                        "Isosceles" :
                        "Scalene";
        System.out.println(result1);
    }
}
