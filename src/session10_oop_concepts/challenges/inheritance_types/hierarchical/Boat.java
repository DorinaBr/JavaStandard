package session10_oop_concepts.challenges.inheritance_types.hierarchical;

public class Boat {

    private double length;
    private double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat sails.");
    }
}
