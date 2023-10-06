package session10_oop_concepts.challenges.inheritance_types.multilevel;

public class ElectricCar extends Car {
    private String batteryCapacity;
    private int range;

    public ElectricCar(String model, String make, int year, String batteryCapacity, int range) {
        super(model, make, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("The electric car charges up.");
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return range;
    }
}
