package session15_equals_hashcode_enum_generics.challenges.enums;

public enum LightColor {

    RED("STOP", 30),
    YELLOW("Caution", 5),
    GREEN("Go",45);

    private String representation;
    private int duration;

    LightColor(String representation, int duration) {
        this.representation = representation;
        this.duration = duration;
    }


    public String informations() {
        return
                "='" + representation + '\'' +
                ", duration=" + duration + " seconds";
    }
}
