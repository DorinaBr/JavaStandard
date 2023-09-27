package session8.practice;

import java.util.Random;

public class RandomIntAlg {
    public static void main(String[] args) {
    printrandomNumber();
    }

    public static void printrandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(1, 17);
        System.out.println(randomNumber);
    }
}
