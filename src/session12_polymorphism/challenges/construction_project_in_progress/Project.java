package session12_polymorphism.challenges.construction_project_in_progress;

import java.util.HashMap;
import java.util.Map;

public class Project {
    private final Map<ResourceType, Integer> availableResources = new HashMap<>();
    private final Map<ResourceType, Integer> requiredResources = new HashMap<>();
    private final String name;
    private ProjectStatus status = ProjectStatus.NEW;
    private Team team;

    public Project(String name) {
        this.name = name;
    }

    public void addAvailableResource(Integer quantity, ResourceType type) {
        addResource(availableResources, type, quantity);
    }

    public void consumeAvailableResource(ResourceType type, Integer quantity) {
        removeResource(availableResources, type, quantity);
    }

    public void addRequiredResource(ResourceType type, Integer quantity) {
        addResource(requiredResources, type, quantity);
    }

    public void removeRequiredResource(ResourceType type, Integer quantity) {
        removeResource(requiredResources, type, quantity);
    }

    public Map<ResourceType, Integer> getAvailableResources() {
        return availableResources;
    }

    public Integer getAvailableQuantity(ResourceType type) {
        return availableResources.get(type);
    }

    public Map<ResourceType, Integer> getRequiredResources() {
        return requiredResources;
    }

    public Integer getRequiredResources(ResourceType type) {
        return requiredResources.get(type);
    }

    private void addResource(Map<ResourceType, Integer> resources, ResourceType type, Integer quantity) {
        if (resources.containsKey(type)) {
            int newQuantity = resources.get(type) + quantity;
            resources.put(type, newQuantity);
        } else {
            resources.put(type, quantity);
        }
    }

    private void removeResource(Map<ResourceType, Integer> resources, ResourceType type, Integer quantity) {
        int newQuantity = resources.get(type) - quantity;
        resources.put(type, newQuantity);
    }

    public String getName() {
        return name;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public enum ProjectStatus {
        NEW,
        DONE,
        FOUNDATION_DONE,
        STRUCTURE_DONE,
        ROOF_DONE,
        WALLS_DONE,
        EXTERIOR_DONE,
        INTERIOR_DONE;
    }
}
