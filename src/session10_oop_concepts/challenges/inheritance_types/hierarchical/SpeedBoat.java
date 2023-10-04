package session10_oop_concepts.challenges.inheritance_types.hierarchical;

public class SpeedBoat extends Boat {

    private int maxSpeed;
    private String engineType;

    public SpeedBoat(double length, double weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost(){
        System.out.println("More power to the engine");
    }
}
