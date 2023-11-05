package extra.task_management;

public class User {
    private final String userName;
    private final String email;

    public User(String username, String email) {
        this.userName = username;
        this.email = email;
    }

    public String getUsername() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User: " +
                "username='" + userName + '\'' +
                ", email='" + email;
    }
}
