package service;

import dao.UserDAO;
import model.User;

import java.util.List;

public class UserService {
    static List<User> userList = UserDAO.findAll();

    public List<User> findAllUser() {
        return userList = UserDAO.findAll();
    }

    public void saveUser(User user) {
        UserDAO.saveUser(user);
        userList = UserDAO.findAll();
    }

    public void updateUser(int id, User user) {
        UserDAO.editUser(id,user);
    }

    public void deleteUser(int id) {
        UserDAO.deleteUser(id);
    }

    public User findUserById(int id) {
        return UserDAO.findUserById(id);
    }

    public User findById(int id) {
        for (User user:userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User findUserByName(String name) {

        return UserDAO.findUserByName(name);
   }

    public void updateAccount(int id, User user) {
        UserDAO.updateAccount(id,user);
    }
}
