package session9.challenges.college_management_system;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private long cnp;
    private int age;
    private LocalDate birthday;
    private List<Course> courses;

    public Student(String firstName, String lastName, String gender, String address, long cnp, int age, LocalDate birthday, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.cnp = cnp;
        this.age = age;
        this.birthday = birthday;
        this.courses = courses;
    }

    public void printSchedule() {
        System.out.println("Schedule of " + firstName + " " + lastName);
        for (Course course : courses) {
            ScheduleEntry scheduleEntry = course.getScheduleEntry();
            System.out.println(course.getName() + "\t" + scheduleEntry.getDayOfWeek() + "\t" + scheduleEntry.getStartsAt() + "\t" + scheduleEntry.getDuration() + "\t" + course.getProfessor().getFullName());
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public long getCnp() {
        return cnp;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
