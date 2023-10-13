package session12_polymorphism.challenges.presentation_examples_recreated.runtime_poly_with_data_member;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.value);
    }
}
