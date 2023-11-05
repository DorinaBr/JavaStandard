package session18_another_recap;

import java.util.Arrays;
import java.util.Collections;

public class Problem5 {

    public static void main(String[] args) {
        String sentence = "Java is very fun";

        String[] sentenceArray = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = sentenceArray.length - 1; index >= 0; index --){
            stringBuilder.append(sentenceArray[index]).append(" ");
        }

        System.out.println(stringBuilder);

        Collections.reverse(Arrays.asList(sentenceArray));
        System.out.println(Arrays.asList(sentenceArray));
    }
}
