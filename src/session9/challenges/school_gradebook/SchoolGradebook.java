package session9.challenges.school_gradebook;

import java.util.List;
import java.util.UUID;

public class SchoolGradebook {

    public static void main(String[] args) {

        Student student1 = new Student(UUID.randomUUID(), "Annie", "Lockheart");
        Grade grade1Student1 = new Grade(7, new Assignment("Algebra1"));
        Grade grade2Student1 = new Grade(8, new Assignment("Algebra2"));
        Grade grade3Student1 = new Grade(6, new Assignment("Algebra3"));
        student1.addGrade(grade1Student1);
        student1.addGrade(grade2Student1);
        student1.addGrade(grade3Student1);

        Student student2 = new Student(UUID.randomUUID(), "Tom", "Applebee");
        Grade grade1Student2 = new Grade(5, new Assignment("Algebra1"));
        Grade grade2Student2 = new Grade(8, new Assignment("Algebra2"));
        Grade grade3Student2 = new Grade(4, new Assignment("Algebra3"));
        student2.addGrade(grade1Student2);
        student2.addGrade(grade2Student2);
        student2.addGrade(grade3Student2);

        Student student3 = new Student(UUID.randomUUID(), "Nick", "Clause");
        Grade grade1Student3 = new Grade(7, new Assignment("Algebra1"));
        Grade grade2Student3 = new Grade(9, new Assignment("Algebra2"));
        Grade grade3Student3 = new Grade(10, new Assignment("Algebra3"));
        student3.addGrade(grade1Student3);
        student3.addGrade(grade2Student3);
        student3.addGrade(grade3Student3);

        Classroom classroom1 = new Classroom("Classroom1", List.of(student1, student2, student3));

        classroom1.printAverage();
    }
}
