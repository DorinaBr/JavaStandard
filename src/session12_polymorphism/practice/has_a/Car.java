package session12_polymorphism.practice.has_a;

public class Car  {

    private Engine engine; //using composition, Car HAS-An Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

    void drive(){
        System.out.println("The car is driving.");
    }
}
