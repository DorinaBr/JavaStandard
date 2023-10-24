package session16_lambda.practice.calculator;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = (a, b, operator) -> executeOperation(a, b, operator);

        System.out.println("Result: " + calculator.calculate(10, 10, '*'));
    }

    private static double executeOperation(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
