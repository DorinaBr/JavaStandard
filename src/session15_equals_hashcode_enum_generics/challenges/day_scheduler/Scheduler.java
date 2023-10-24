package session15_equals_hashcode_enum_generics.challenges.day_scheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scheduler {

    private final Map<Day, List<String>> schedule = new HashMap<>();

    public Scheduler() {
        for (Day day : Day.values()) {
            schedule.put(day, new ArrayList<>());
        }
    }

    public void addActivity(Day day, String activity) {
        schedule.get(day).add(activity);
    }

    public List<String> getActivities(Day day) {
        return schedule.get(day);
    }
}
