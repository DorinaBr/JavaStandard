package session12_polymorphism.challenges.construction_project_in_progress;

public enum ResourceType {
    WOOD("m3"),
    CEMENT("kg"),
    CONCRETE("m3"),
    STEEL("cwt"),
    BRICKS("m3"),
    SAND("m3"),
    GLASS("mm");

    private final String um;

    ResourceType(String um) {
        this.um = um;
    }

    public String getUm() {
        return um;
    }

    @Override
    public String toString() {
        return name() + " " + getUm() + " ";
    }

}
