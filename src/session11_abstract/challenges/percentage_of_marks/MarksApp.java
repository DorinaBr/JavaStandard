package session11_abstract.challenges.percentage_of_marks;

import java.text.DecimalFormat;

public class MarksApp {

    public static void main(String[] args) {
        StudentA studentA = new StudentA(50, 80, 70);
        StudentB studentB = new StudentB(80, 70, 100, 40);

        DecimalFormat decimalFormat = new DecimalFormat("##.0");

        System.out.println("Student A's percentage is: " + decimalFormat.format(studentA.getPercentage()));
        System.out.println("Student B's percentage is: " + decimalFormat.format(studentB.getPercentage()));
    }
}
