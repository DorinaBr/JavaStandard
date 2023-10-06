package session10_oop_concepts.challenges.inheritance_types.multilevel;

public class Car {

    private String model;
    private String make;
    private int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.year = year;
        this.make = make;
    }

    public void start() {
        System.out.println("The car starts.");
    }

    public void stop() {
        System.out.println("The car stops");
    }

    public void accelerate() {
        System.out.println("The car accelerates.");
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
