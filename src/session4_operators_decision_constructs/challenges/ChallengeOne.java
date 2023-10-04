package session4_operators_decision_constructs.challenges;
//Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.

public class ChallengeOne {
    public static void main(String[] args) {
        String stringOne = "OpenAi";
        String stringTwo = "OpenAi";

        System.out.println(stringOne == stringTwo);

    }
}
