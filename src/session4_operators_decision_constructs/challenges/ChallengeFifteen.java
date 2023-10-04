package session4_operators_decision_constructs.challenges;

/*Write a Java program where you declare an integer variable total with a value of 100.
 Use the compound assignment operator to decrease the total by 20 and then print the value.
 Next, use another compound assignment operator to multiply the total by 2 and then print the value.*/
public class ChallengeFifteen {
    public static void main(String[] args) {
        int total = 100;

        String newLine = System.lineSeparator();

        System.out.println("Decreased total: " + (total -= 20) + newLine + "Multiplied total: " + (total *= 2));
    }
}

