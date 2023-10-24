package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.person;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Ana");
        person1.setAge(23);
        person1.setEmail("ana@gmail.com");

        Person person2 = new Person();
        person2.setName("Ana");
        person2.setAge(23);
        person2.setEmail("ana@gmail.com");

        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 hascode: " + person1.hashCode());
        System.out.println("person2 hascode: " + person2.hashCode());

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);

        System.out.println("The set has the size of: " + persons.size());
        System.out.println("The set contains: " + persons);
    }
}
