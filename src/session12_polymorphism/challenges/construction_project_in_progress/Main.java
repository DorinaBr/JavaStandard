package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.List;

import static session12_polymorphism.challenges.construction_project_in_progress.ResourceType.*;

public class Main {
    public static void main(String[] args) {
        AppInterface api = new AppInterface();
        Project house1 = new Project("Mediterranean House");

        ProjectManager.addProject(house1);

        api.addAvailableResource(house1.getName(), WOOD, 300);
        System.out.println("Project status: " + api.getStatus(house1.getName()));
        System.out.println("Available resources: " + api.getAvailableResources(house1.getName()));

        api.consumeAvailableResources(house1.getName(), WOOD, 100);
        System.out.println("Available resources: " + api.getAvailableResources(house1.getName()));

        api.addRequiredResources(house1.getName(), CEMENT, 100);
        api.addRequiredResources(house1.getName(), GLASS, 1000);
        System.out.println("Required resources: " + api.getRequiredResources(house1.getName()));


        api.addNewEmployee("Bob", "Marley", EmployeeRole.LEAD);
        api.addNewEmployee("George", "Bush", EmployeeRole.CARPENTER);

//        Team team = new Team("Team1", List<String>);
    }
}
