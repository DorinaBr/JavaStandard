package session4.challenges;

//Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
public class ChallengeFive {
    public static void main(String[] args) {
        for (int index = 1; index <= 10; index++) {
            System.out.print(index + " ");
        }
        System.out.println(); //Empty line

        for (int index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
    }
}
