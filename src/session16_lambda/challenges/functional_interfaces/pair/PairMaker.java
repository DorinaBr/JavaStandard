package session16_lambda.challenges.functional_interfaces.pair;

@FunctionalInterface

public interface PairMaker<T,U> {
    GenericPair<T,U> returnPair(T t, U u);
}
