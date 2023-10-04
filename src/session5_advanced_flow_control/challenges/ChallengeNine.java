package session5_advanced_flow_control.challenges;

/*Given an array of integers, write a program that prints each number in the array
followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.*/
public class ChallengeNine {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 5, 7, 15, 18};

        for (int index = 0; index < myArray.length; index++) {
            System.out.print(myArray[index] + " -> ");
            String result = (myArray[index] % 2 == 0) ? "Even" : "Odd";
            System.out.println(result);
        }
    }
}
