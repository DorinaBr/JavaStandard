package session10_oop_concepts.challenges.inheritance_types.multilevel;

public class Tesla extends ElectricCar {
    private String autopilotVersion;

    public Tesla(String model, int year, String batteryCapacity, int range, String autopilotVersion) {
        super(model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Tesla's autopilot enabled.");
    }
}
