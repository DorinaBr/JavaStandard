package session10_oop_concepts.challenges.inheritance_types.multilevel;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The car starts.");
    }

    public void stop() {
        System.out.println("The car stops.");
    }

    public void accelerate() {
        System.out.println("The car accelerates.");
    }
}
