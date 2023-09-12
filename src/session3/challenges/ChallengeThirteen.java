package session3.challenges;

import java.util.Scanner;

//Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation
public class ChallengeThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the price of the product: ");
        double price = scanner.nextDouble();

        System.out.println("Type the discount(%) of the product = ");
        double discount = scanner.nextDouble();


        price-= price*discount/100;


        System.out.println("The final price is: " +  price);
    }
}

