package session12_polymorphism.practice.has_a;

import session12_polymorphism.practice.is_a.Engine;

public class Car  {

    private Engine engine; //using composition, Car HAS-An Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

//    void start(){
//        engine.start();
//    }
//
//    void drive(){
//        engine.drive();
//    }
}
