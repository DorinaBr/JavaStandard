package session12_polymorphism.challenges.presentation_examples_recreated.runtime_time_poly;

public class Test {
    public static void main(String[] args) {
        Parent parent = new SubclassOne();
        parent.print();

        parent = new SubclassTwo();
        parent.print();
    }
}
