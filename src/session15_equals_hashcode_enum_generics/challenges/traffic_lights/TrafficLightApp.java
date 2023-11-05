package session15_equals_hashcode_enum_generics.challenges.traffic_lights;

import java.util.Arrays;
import java.util.Comparator;

public class TrafficLightApp {

    public static void main(String[] args) {
        while (true) {
            Arrays.stream(TrafficLightColor.values()).sorted(Comparator.comparing(TrafficLightColor::getOrder)).forEach(color -> {
                System.out.println(color.getDescription());
                for (int index = color.getDuration(); index > 0; index--) {
                    System.out.println(index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }
}
