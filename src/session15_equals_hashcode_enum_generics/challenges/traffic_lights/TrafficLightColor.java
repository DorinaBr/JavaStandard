package session15_equals_hashcode_enum_generics.challenges.traffic_lights;

public enum TrafficLightColor{
    RED(1,"Stop",20),
    YELLOW(3,"Caution",5),
    GREEN(2,"Go",10);

    private final String description;
    private final int duration;
    private final Integer order;

    TrafficLightColor(int order, String description, int duration) {
        this.order = order;
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public Integer getOrder() {
        return order;
    }
}
