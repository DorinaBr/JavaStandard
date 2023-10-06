package session11_abstract.practice.user_service;

public interface UserService {

    /**
     * Creates a user
     * @param user
     * @return
     */
    User createUser(User user);

    void deleteUser(long id);
}
