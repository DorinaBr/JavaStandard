package session8_array_vs_arraylist.challenges;

public class CountEvenAndOddNumbersInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 9, 10, 11, 16, 19};
        int countEven = 0;
        int countOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("The array has " + countEven + " even numbers and " + countOdd + " odd numbers.");
    }
}
