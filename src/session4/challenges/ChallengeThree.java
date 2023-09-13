package session4.challenges;

//Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
public class ChallengeThree {
    public static void main(String[] args) {
        int age = 20;
        String result = (age > 18) ? "I am an adult." : "I am not an adult.";
        System.out.println(result);
    }

}
