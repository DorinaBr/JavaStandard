package session16_lambda.challenges.functional_interfaces.doub;

public class DoubleTest {

    public static void main(String[] args) {
       DoubleProcessor sqrtInput = Math::sqrt;
        System.out.println("The square root of the input is: " + sqrtInput.sqrt(9.0));
    }
}
