package session9.challenges.school_gradebook;

public class Grade {
    private int value;
    private Assignment assignment;

    public Grade(int value, Assignment assignment) {
        this.value = value;
        this.assignment = assignment;
    }

    public int getValue() {
        return value;
    }

    public Assignment getAssignment() {
        return assignment;
    }
}
