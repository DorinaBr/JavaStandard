package session11_abstract.challenges.percentage_of_marks;

import java.util.List;

public abstract class Marks {

    abstract double getPercentage();

    private boolean isMarkValid(double mark) {
        if (mark < 0 || mark > 100) {
            return false;
        }
        return true;
    }

    public void verifyAndMark(double mark, List<Double> studentMarks) {
        if (isMarkValid(mark)) {
            studentMarks.add(mark);
        } else {
            System.out.println("The mark is invalid!");
        }
    }
}
