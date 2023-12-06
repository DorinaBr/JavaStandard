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
 */
public class Main {

    private static final Map<Long, Task> tasks = new HashMap<>();
    private static final Map<String, User> users = new HashMap<>();


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
                printTasks(tasks.values());
                break;
            case 5:
                List<Task> tasksByStatus = retrieveTasks(readStatus());
                printTasks(tasksByStatus);
                printTasksByStatus(readStatus());
                break;
            case 6:
                createUser();
                break;
            case 7:
                printUser(readUserName());
                break;
            case 8:
                return;
            default:
                System.out.println("Invalid option.");
        }
        openMenu();
    }


    private static void printUser(String userNameInput) {
        System.out.println(users.get(userNameInput));
    }

    private static String readEmail() {
        try {
            System.out.println("Enter your email: ");
            return new Scanner(System.in).next();
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid email");
            return readEmail();
        }
    }

    private static String readUserName() {
        try {
            System.out.println("Enter the username: ");
            return new Scanner(System.in).next();
        } catch (NoSuchElementException exception) {
            System.out.println("Invalid username");
            return readUserName();
        }
    }

    private static void createUser() {
        String userName = readUserName();
        String email = readEmail();

        User user = new User(userName, email);
        users.put(userName, user);
    }

    private static List<Task> retrieveTasks(Task.Status status) {
        return tasks.values().stream().filter(task -> status.equals(task.getStatus())).toList();
    }

    private static void printTasks(Collection<Task> tasks) {
        tasks.forEach(System.out::println);
    }

    private static void printTasksByStatus(Task.Status status) {
        tasks.values().stream().filter(task -> task.getStatus().equals(status)).forEach(System.out::println); // .forEach(task -> System.out.println(task))
//        Map<String, Task> taskNames = tasks.values().stream().collect(Collectors.toMap(Task::getName, task -> task));
//        System.out.println(taskNames);
//
//        for (Task task : tasks.values()) {
//            if (status.equals(task.getStatus())) {
//                System.out.println(task);
//            }
//        }
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
        System.out.println("6. Create user");
        System.out.println("7. Retrieve user for username");
        System.out.println("8. Exit");


    }
}
