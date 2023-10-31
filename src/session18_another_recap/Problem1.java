package session18_another_recap;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        String sentence = "Today is Halloween";
        long result = Arrays.stream(sentence.split(" "))
                .filter(word -> word.length() > 3)
                .count();
        System.out.println(result);
    }
}
