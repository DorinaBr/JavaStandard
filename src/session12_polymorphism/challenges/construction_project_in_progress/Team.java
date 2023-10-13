package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Team(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
