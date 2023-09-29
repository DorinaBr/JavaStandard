package session8.challenges;

import java.util.ArrayList;

public class StudentListAndGraduateStudentList {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("John");
        studentList.add("Mary");
        studentList.add("Dan");
        studentList.add("Ana");
        studentList.add("Murphy");
        studentList.add("Joanna");
        studentList.add("Alice");
        studentList.add("Tom");
        studentList.add("Sam");
        studentList.add("Abigail");

        graduateStudentList = (ArrayList<String>) studentList.clone();

        System.out.println("The graduate students are: ");

        for (String graduate : graduateStudentList) {
            System.out.println(graduate);
        }
    }
}
