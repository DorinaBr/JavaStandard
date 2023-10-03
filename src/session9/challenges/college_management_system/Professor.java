package session9.challenges.college_management_system;

import java.time.LocalDate;

public class Professor {

    private String firstName;
    private String lastName;
    private String sex;
    private String address;
    private long cnp;
    private int age;
    private LocalDate birthday;
    public Course course;

    public Professor(String firstName, String lastName, String sex, String address,
                   long cnp, int age, LocalDate birthday) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.cnp = cnp;
        this.age = age;
        this.birthday = birthday;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public long getCnp() {
        return cnp;
    }
    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
