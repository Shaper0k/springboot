package web.service;

import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    List<User> getAllUsers();
    @Transactional
    User findUserByUsername (String login);
}
