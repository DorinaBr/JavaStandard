package session17_streams.challenges.highest_salary;

public class Employee {
    private final String firstName;
    private final String lasName;
    private final double salary;
    private Department department;

    public Employee(String firstName, String lasName, double salary, Department department) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary;
    }
}
