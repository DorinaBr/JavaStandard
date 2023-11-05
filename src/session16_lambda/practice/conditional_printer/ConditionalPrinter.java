package session16_lambda.practice.conditional_printer;

@FunctionalInterface

public interface ConditionalPrinter {

   void print(String str, boolean condition);
}
