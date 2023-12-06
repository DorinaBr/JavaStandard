package extra.task_management;

import java.util.UUID;

public class Task {

    private final String name;
    private final long id = Math.abs(UUID.randomUUID().getMostSignificantBits());
    private User user;
    private Status status = Status.NEW;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Task: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status;
    }

    public enum Status {
        NEW,
        IN_PROGRESS,
        IN_REVIEW,
        DONE
    }
}
