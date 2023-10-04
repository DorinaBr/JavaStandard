package session4_operators_decision_constructs.challenges;

/*Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively.
Use the logical complement operator to negate the values of both variables and print the new values.*/
public class ChallengeThirteen {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        String newLine = System.lineSeparator();

        System.out.println("Is it raining? " + isRaining + newLine + "Is it sunny? " + isSunny);
        System.out.println();
        System.out.println("Is it raining? " + !isRaining + newLine + "Is it sunny? " + !isSunny);
    }

}
