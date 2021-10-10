package web.service;

import web.model.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    Optional<User> getUserById(long id);

    List<User> getAllUsers();

    User getUserByUsername(String name);
}
