package session15_equals_hashcode_enum_generics.challenges.day_scheduler;

public class SchedulerApp {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.addActivity(Day.MONDAY, "Reading");
        scheduler.addActivity(Day.MONDAY, "Workout");
        scheduler.addActivity(Day.TUESDAY, "Paperwork");
        scheduler.addActivity(Day.WEDNESDAY, "Walking");
        scheduler.addActivity(Day.THURSDAY, "Shopping");
        scheduler.addActivity(Day.FRIDAY, "Workout");

        System.out.println("Monday activities : " + scheduler.getActivities(Day.MONDAY));
        System.out.println("Tuesday activities: " + scheduler.getActivities(Day.TUESDAY));
    }
}
