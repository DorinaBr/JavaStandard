package session4_operators_decision_constructs.challenges;
/*Write a Java program that simulates a simple authentication system.
 Declare a boolean variable hasUsername and hasPassword.
 Set up a /series of logical conditions using these tw/o variables that will check the following conditions:

        If both hasUsername and hasPassword are true, print "Authentication successful".
        If either hasUsername or hasPassword is false, print "Authentication failed".
        If hasUsername is true but hasPassword is false, print "Password is incorrect".*/


public class ChallengeSeventeen {
    public static void main(String[] args) {

        boolean hasUserName = true;
        boolean hasPassword = true;

        if (hasUserName && hasPassword) {
            System.out.println("Authentication successful.");
        } else if (hasUserName) {
            System.out.println("Password incorrect");
        } else System.out.println("Authentication failed.");

    }
}
