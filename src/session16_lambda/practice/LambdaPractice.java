package session16_lambda.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMultiply = (a,b)-> a*b;

        System.out.println("Multiply: " + getMultiply.multiply(10,3));
        System.out.println("Sum" + getSum.sum(10, 25));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        //print names elements with lambda
        names.forEach(System.out::println);

        //print names elements with for
        for (String name : names) {
            System.out.println(name);
        }
    }
}
