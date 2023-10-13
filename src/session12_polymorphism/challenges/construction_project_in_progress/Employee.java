package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.UUID;

public class Employee {
    private final String id = UUID.randomUUID().toString();
    private String firstName;
    private String lastName;
    private EmployeeRole role;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeRole=" + role +
                '}';
    }
}
