package session9_oop.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private UUID studentId;
    private String firstName;
    private String lastName;
    private final List<Grade> grades = new ArrayList<>();
    public Student(UUID studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public int getAverageGrade() {
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.getValue();
        }
        return sum / grades.size();
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Grade> getGrades() {
        return grades;
    }
}
