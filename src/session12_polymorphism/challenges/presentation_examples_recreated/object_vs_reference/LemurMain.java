package session12_polymorphism.challenges.presentation_examples_recreated.object_vs_reference;

public class LemurMain {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur lemur2 = (Lemur) primate; // cast the object back to the subclass
        System.out.println(lemur2.age);
    }
}
