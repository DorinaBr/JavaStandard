package session16_lambda.challenges.functional_interfaces.string;

public class StringComparing {

    public static void main(String[] args) {
        StringProcessor compareLength = (str1, str2) -> str1.length() == str2.length();

        System.out.println("The result of comparing 2 strings length is: " + compareLength.process("apple","banana"));

        StrConcat joinedStrings = (strOne, strTwo) -> strOne.concat(" ").concat(strTwo).concat("!");
        System.out.println("The joined strings result is: " + joinedStrings.concat("Hello","world"));
    }
}
