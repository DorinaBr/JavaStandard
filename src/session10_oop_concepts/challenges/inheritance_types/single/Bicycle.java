package session10_oop_concepts.challenges.inheritance_types.single;

public class Bicycle {

    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear() {
        System.out.println("Gear changed");
    }

    public void speedUp() {
        System.out.println("The speed increased");
    }

    public void applyBrake() {
        System.out.println("Break");
    }
}
