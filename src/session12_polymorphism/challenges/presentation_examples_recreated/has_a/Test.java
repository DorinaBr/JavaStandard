package session12_polymorphism.challenges.presentation_examples_recreated.has_a;

public class Test {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);

        car.start();
    }
}
