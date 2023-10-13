package session12_polymorphism.challenges.construction_project_in_progress;

import session12_polymorphism.challenges.construction_project_in_progress.Project.ProjectStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppInterface {
    public void addAvailableResource(String projectName, ResourceType type, Integer quantity) {
        ProjectManager.getProject(projectName).addAvailableResource(quantity, type);
    }

    public Map<ResourceType, Integer> getAvailableResources(String projectName) {
        return ProjectManager.getProject(projectName).getAvailableResources();
    }

    public void consumeAvailableResources(String projectName, ResourceType type, Integer quantity) {
        ProjectManager.getProject(projectName).consumeAvailableResource(type, quantity);
    }

    public void addRequiredResources(String projectName, ResourceType type, Integer quantity) {
        ProjectManager.getProject(projectName).addRequiredResource(type, quantity);
    }

    public Map<ResourceType, Integer> getRequiredResources(String projectName) {
        return ProjectManager.getProject(projectName).getRequiredResources();
    }


    public void setStatus(String projectName, ProjectStatus status) {
        ProjectManager.getProject(projectName).setStatus(status);
    }

    public ProjectStatus getStatus(String projectName) {
        return ProjectManager.getProject(projectName).getStatus();
    }

    public String addNewEmployee(String firstName, String lastName, EmployeeRole role) {
        return EmployeeManager.addNewEmployee(firstName, lastName, role).getId();
    }

    public Team addNewTeam(String name, List<String> employeeIds) {
        List<Employee> employees = new ArrayList<>();
        for (String employeeId : employeeIds) {
            employees.add(EmployeeManager.getEmployee(employeeId));
        }
        return TeamManager.addNewTeam(name, employees);
    }
}
