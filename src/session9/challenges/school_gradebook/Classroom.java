package session9.challenges.school_gradebook;

import java.util.List;

public class Classroom {

    private String name;
    private List<Student> students;

    public void printAverage() {
        System.out.println("Student information: ");

        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + "\n" + "Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Average grade : " + student.getAverageGrade() + "\n");
        }
    }

    public Classroom(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
