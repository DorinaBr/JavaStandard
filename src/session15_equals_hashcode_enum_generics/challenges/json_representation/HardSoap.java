package session15_equals_hashcode_enum_generics.challenges.json_representation;

import java.util.List;

public class HardSoap {

    private String type;
    private final boolean hasFragrance;
    private final boolean isAntiseptic;
    private final double phValue;

    public HardSoap(String type, boolean hasFragrance, boolean isAntiseptic, double phValue) {
        this.type = type;
        this.hasFragrance = hasFragrance;
        this.isAntiseptic = isAntiseptic;
        this.phValue = phValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\"Hard soap\": {" +
                "\n\"type\" : \"" + type + '\"' + ", "+ "\n" +
                "\"hasFragrance\" : " + hasFragrance +  ", "+  "\n" +
                "\"isAntiseptic\" : " + isAntiseptic +", "+  "\n" +
                "\"phValue\" : " + phValue + "\n" +
                '}';
    }
}
