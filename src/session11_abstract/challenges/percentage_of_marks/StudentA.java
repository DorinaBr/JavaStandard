package session11_abstract.challenges.percentage_of_marks;

import java.util.ArrayList;
import java.util.List;

public class StudentA extends Marks {

    private List<Double> studentMarks;

    public StudentA(double mathMark, double englishMark, double scienceMark) {
        studentMarks = new ArrayList<>();
        super.verifyAndMark(mathMark, studentMarks);
        super.verifyAndMark(englishMark, studentMarks);
        super.verifyAndMark(scienceMark, studentMarks);
    }

    @Override
    double getPercentage() {
        double sum = 0;

        for (double mark : studentMarks) {
            sum += mark;
        }
        return sum / (studentMarks.size() * 100) * 100;
    }
}
