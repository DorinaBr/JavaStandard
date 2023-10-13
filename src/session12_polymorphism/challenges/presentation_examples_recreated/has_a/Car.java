package session12_polymorphism.challenges.presentation_examples_recreated.has_a;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start(){
        engine.start();
    }
}
