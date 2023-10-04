package session10_oop_concepts.challenges.inheritance_types.hierarchical;

public class FishingBoat extends Boat {
    private double fishCapacity;
    private String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("The net was casted.");
    }
}
