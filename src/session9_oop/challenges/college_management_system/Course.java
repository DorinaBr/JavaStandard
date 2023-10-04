package session9_oop.challenges.college_management_system;

public class Course {

    private String name;
    private String description;
    private ScheduleEntry scheduleEntry;
    private Professor professor;

    public Course(String name, String description, ScheduleEntry scheduleEntry, Professor professor) {
        this.name = name;
        this.description = description;
        this.scheduleEntry = scheduleEntry;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ScheduleEntry getScheduleEntry() {
        return scheduleEntry;
    }

    public Professor getProfessor() {
        return professor;
    }
}
