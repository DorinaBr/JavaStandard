package session5_advanced_flow_control.challenges;

//Given an array of integers, write a program to count and print the number of negative integers in the array.
public class ChallengeThree {
    public static void main(String[] args) {
        int[] myArray = {-3, 4, -9, -7, 5, 11, -13};
        int count = 0;
        int index = 0;

        while (index < myArray.length) {
            if (myArray[index] < 0) {
                count++;
                System.out.print(myArray[index] + "\t");
            }
            index++;
        }
        System.out.println("The number of negative integers is: " + count);

    }
}
