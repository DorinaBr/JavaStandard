package session16_lambda.challenges.functional_interfaces.integer_and_string;

public class StrAndInt {

    public static void main(String[] args) {
        StrAndIntProcessor charOrString = (str, n) -> {
            if (n > str.length())
                return str;
            return str.substring(0, n);
        };

        StrAndIntProcessor result = charOrString;
        System.out.println("The result is: " + result.process("banana", 9));
    }
}
