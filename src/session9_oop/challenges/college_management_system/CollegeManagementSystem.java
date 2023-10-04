package session9_oop.challenges.college_management_system;

import java.time.*;
import java.util.List;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Professor mathProfessor = new Professor("Bob", "Smart", "male", "55 Almonds Street, London",
                1762307226711L, 47, LocalDate.of(1976, Month.JULY, 23));
        Course mathCourse = new Course("Math", "Algebra", new ScheduleEntry(DayOfWeek.MONDAY, Duration.ofHours(2), LocalTime.of(9, 0)), mathProfessor);

        Professor englishProfessor = new Professor("Annie", "McBeetle", "female", "13 Violet Street, London",
                2781804226711L, 45, LocalDate.of(1978, Month.APRIL, 18));
        Course englishCourse = new Course("English", "Literature", new ScheduleEntry(DayOfWeek.THURSDAY, Duration.ofHours(1), LocalTime.of(11, 0)), englishProfessor);

        Student student = new Student("Alice", "Newbie", "female", "13 Peacock Street, London",
                1912110228811L, 31, LocalDate.of(1991, Month.OCTOBER, 21), List.of(mathCourse, englishCourse));

        student.printSchedule();
    }
}
