package session9.challenges.college_management_system;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class ScheduleEntry {

    private DayOfWeek dayOfWeek;

    private Duration duration;
    private LocalTime startsAt;

    public ScheduleEntry(DayOfWeek dayOfWeek, Duration duration, LocalTime startsAt) {
        this.dayOfWeek = dayOfWeek;
        this.duration = duration;
        this.startsAt = startsAt;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getStartsAt() {
        return startsAt;
    }

    public Duration getDuration() {
        return duration;
    }
}
