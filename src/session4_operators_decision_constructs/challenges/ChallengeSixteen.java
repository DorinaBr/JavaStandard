package session4_operators_decision_constructs.challenges;

/*Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
First, negate number, then take the absolute value, and finally increment it by 1.
Print the result at each step.*/
public class ChallengeSixteen {
    public static void main(String[] args) {
        int number = 50;

        String newLine = System.lineSeparator();

        System.out.println("Negated number: " + (-number) + newLine + "Absolute value of the number: " + Math.abs(number));
        System.out.println("Incremented value by 1: " + (++number));
    }
}
