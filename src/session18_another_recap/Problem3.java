package session18_another_recap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Problem3 {

    public static void main(String[] args) {
        List<Integer> randomNumbers = Arrays.asList(1, 4, 6, 656, 878, 5, 65, 6);
        printMinAndMax(randomNumbers);
    }

    private static void printMinAndMax(List<Integer>list){
       OptionalInt min =  list.stream()
               .mapToInt(Integer::intValue)
               .min();

       OptionalInt max = list.stream()
               .mapToInt(Integer::intValue)
               .max();
        System.out.println("min: " + min.getAsInt() + ", max: " + max.getAsInt());
    }
}
