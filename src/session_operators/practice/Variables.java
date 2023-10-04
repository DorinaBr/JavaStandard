package session_operators.practice;

public class Variables {
    private static String name = "John";
    public static void main(String[] args) {
        int age; //declaration
        age = 27; //initialization

        int myAge = 29;

        System.out.println("I'm John and I'm " + myAge +  " years old.");
    }
    public static void practiceVariableScope(){
        int outerVal = 24;

        if (outerVal > 10){
            int innerVal = 200;
            System.out.println(innerVal + outerVal);
        }
        //System.out.println(innerVal); this leads to a compile error due to variable scopes
    }
}
