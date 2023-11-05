package session16_lambda.challenges.functional_interfaces.generic;

import java.util.Arrays;
import java.util.List;

public class LambdaWithGenerics {

    public static void main(String[] args) {
        GenericInterface isInTheList = (List::contains);
        System.out.println("The element is in the list : " + isInTheList.check(Arrays.asList(2,3,4,6), "ana"));
    }
}
