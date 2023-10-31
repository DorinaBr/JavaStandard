package extra.task_management;

import java.util.*;


/*
Create a task management application that allows users to:
- create a new task with status NEW
    - parameters: name
    - returns: id
- retrieve task for id
    - parameters: id
    - returns: task
- update a task's status to one of the following: IN_PROGRESS, IN_REVIEW, DONE
    - parameters: id, new status
- retrieve all tasks
    - returns: list of tasks
- retrieve all tasks in a certain status
    - parameters: status
    - returns: list of tasks
- create a new user
    - parameters: username, email
    - retrieve user for username
- parameters: username
    - returns: user
- assign a task to a user
    - parameters: username
- retrieve all tasks assigned to a certain user
    - parameters: username
    - returns: tasks
- send email to user with list of tasks in statuses NEW or IN_PROGRESS (emailing will be done by just printing in console)
 */
public class Main {

    private static final Map<Long, Task> tasks = new HashMap<>();

    public static void main(String[] args) {
        openMenu();
    }

    private static void openMenu() {
        printMenu();
        System.out.println("Select option:");
        int menuEntry = new Scanner(System.in).nextInt();
        switch (menuEntry) {
            case 1:
                createTask();
                break;
            case 2:
                printTask(readId());
                break;
            case 3:
                long id = readId();
                updateTaskStatus(id);
                printTask(id);
                break;
            case 4:
                printAllTasks();
                break;
            case 5:
                retrieveTasksByStatus(readStatus());
                break;
            case 6:
                return;
            default:
                System.out.println("Invalid option.");
        }
        openMenu();
    }

    private static List<Task> retrieveTasksByStatus(Task.Status status) {
        return tasks.values().stream().filter(task -> status.equals(task.getStatus())).toList();
    }

    private static void printAllTasks() {
        System.out.println(tasks);
    }

    private static long readId() {
        try {
            System.out.println("Enter the task's ID:");
            return new Scanner(System.in).nextLong();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid ID");
            return readId();
        }
    }

    private static void updateTaskStatus(long id) {
        Task.Status status = readStatus();
        tasks.get(id).setStatus(status);
    }

    private static void printTask(long id) {
        System.out.println(tasks.get(id));
    }

    private static Task.Status readStatus() {
        try {
            System.out.println("Enter the task's status:");
            String status = new Scanner(System.in).next();
            return Task.Status.valueOf(status);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid task status. Valid options: NEW, IN_PROGRESS, IN_REVIEW, DONE");
            return readStatus();
        }
    }

    private static void createTask() {
        System.out.println("Enter the task's name:");
        String name = new Scanner(System.in).next();
        Task task = new Task(name);
        long id = task.getId();
        tasks.put(id, task);
        System.out.println("The task's id is: " + id);
    }

    private static void printMenu() {
        System.out.println("1. Create new task");
        System.out.println("2. Retrieve task by ID");
        System.out.println("3. Update task status");
        System.out.println("4. Retrieve all tasks");
        System.out.println("5. Retrieve all tasks in a certain status");
        System.out.println("6. Exit");
    }
}
