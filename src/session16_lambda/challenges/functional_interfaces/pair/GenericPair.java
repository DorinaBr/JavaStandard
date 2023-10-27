package session16_lambda.challenges.functional_interfaces.pair;

public class GenericPair<T,U>{

    T tValue;
    U uValue;

    public GenericPair(T tValue, U uValue) {
        this.tValue = tValue;
        this.uValue = uValue;
    }

    public T gettValue() {
        return tValue;
    }

    public U getuValue() {
        return uValue;
    }

    public void settValue(T tValue) {
        this.tValue = tValue;
    }

    public void setuValue(U uValue) {
        this.uValue = uValue;
    }

    @Override
    public String toString() {
        return tValue + " = " + uValue;
    }
}
