package session16_lambda.challenges.functional_interfaces.integer;


import java.util.Arrays;
import java.util.Collections;

public class IntegerList {

    public static void main(String[] args) {
        IntegerProcessor maxValue = input -> {
            if (input.isEmpty())
                System.out.println("Invalid input.");
            return Collections.max(input, null);
        };

        IntegerProcessor result = maxValue;
        System.out.println("Max value of the list is: " + maxValue.process(Arrays.asList(2,4,8,21)) );
    }
}
