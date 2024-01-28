package extra_exercices;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int n = 8;
        int[] numbers = {1, 2, 4, 5, 3, 7, 8};
        numbers = Arrays.stream(numbers).sorted().toArray();

        printMissingNumber(n, numbers);
    }

    private static void printMissingNumber(int n, int[] numbers) {
        for (int index = 1; index <= n; index++) {
            int current = index;
            if (Arrays.stream(numbers).noneMatch(number -> number == current))
                System.out.println("The missing number is: " + index);
        }
    }
}
