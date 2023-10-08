package session10_oop_concepts.challenges.inheritance_types.multilevel;

public class Tesla extends ElectricCar {
    private String autopilotVersion;

    public Tesla(String model, int year, String make, String batteryCapacity, int range, String autopilotVersion) {
        super(model, make, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot enabled.");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging up.");
    }

    public String getAutopilotVersion() {
        return autopilotVersion;
    }
}

