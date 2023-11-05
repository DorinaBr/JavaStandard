package session16_lambda.challenges.functional_interfaces.pair;

public class Test {

    public static void main(String[] args) {
        PairMaker pairMaker = (t, u) -> new GenericPair<>(t, u);

        GenericPair pairOne = pairMaker.returnPair("a + b", 5);
        GenericPair pairTwo = pairMaker.returnPair("It's raining", true);

        System.out.println(pairOne);
        System.out.println(pairTwo);
    }
}
