package session10_oop_concepts.challenges.inheritance_types.single;

public class MountainBike extends Bicycle {

    private String tireType;
    private int suspension;

    public MountainBike(int speed, int gear, String tireType, int suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension() {
        System.out.println("Suspension adjusted.");
    }
}
