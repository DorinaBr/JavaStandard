package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Bob");
        student1.setAge(21);
        student1.setEmail("bob@gmail.com");

        Student student2 = new Student();
        student2.setName("Bob");
        student2.setAge(21);
        student2.setEmail("bob@gmail.com");

        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 hashcode: " + student1.hashCode());
        System.out.println("student2 hashcode: " + student2.hashCode());

        System.out.println( student1);
    }
}
