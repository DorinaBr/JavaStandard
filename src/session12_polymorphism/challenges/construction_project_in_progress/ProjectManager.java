package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.HashMap;
import java.util.Map;

public class ProjectManager {
    private static final Map<String, Project> projects = new HashMap<>();

    private ProjectManager() {
    }

    public static void addProject(Project project) {
        projects.put(project.getName(), project);
    }

    public static Map<String, Project> getProjects() {
        return projects;
    }

    public static Project getProject(String projectName) {
        return projects.get(projectName);
    }
}
