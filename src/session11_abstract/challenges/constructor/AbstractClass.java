package session11_abstract.challenges.constructor;

public abstract class AbstractClass {

    public AbstractClass() {
        System.out.println("This is constructor of abstract class.");
    }

    abstract void a_method();

    public void concreteMethod(){
        System.out.println("This is a normal method of abstract class.");
    }
}
