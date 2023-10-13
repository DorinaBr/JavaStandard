package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private static final Map<String, Employee> employees = new HashMap<>();

    private EmployeeManager() {
    }



    public static Map<String, Employee> getEmployees() {
        return employees;
    }

    public static Employee addNewEmployee(String firstName, String lastName, EmployeeRole role) {
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setRole(role);
        employees.put(employee.getId(), employee);
        return employee;
    }

    public static Employee getEmployee(String employeeId) {
        return employees.get(employeeId);
    }
}
