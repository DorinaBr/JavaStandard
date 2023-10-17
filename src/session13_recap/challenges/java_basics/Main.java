package session13_recap.challenges.java_basics;

public class Main {
    public static void main(String[] args) {
        Scope object1 = new Scope();
        object1.local();

        Scope object2 = new Scope();
        object2.instance = 14;
        object2.instanceScope();

        Scope object3 = new Scope();
        Scope.statVariable = 9;
        object3.staticVariable();
    }
}

class Scope {
    static int statVariable = 5;
    int instance = 7;

    public void staticVariable() {
        System.out.println("Static variable: " + statVariable);
    }

    public void instanceScope() {
        System.out.println("Instance variable: " + instance);
    }

    public void local() {
        int local = 10;
        System.out.println("Local variable: " + local);
    }
}
