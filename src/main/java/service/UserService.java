package service;

import dao.UserDAO;
import model.User;

import java.util.List;

public class UserService {
    static List<User> userList = UserDAO.findAll();

    public List<User> findAllUser() {
        userList = UserDAO.findAll();
        for (User user : userList) {
            if (user.getIdRole() == 1) {
                user.setRole("user");
            } else {
                user.setRole("admin");
            }
        }
        return userList;
    }

    public void saveUser(User user) {
        UserDAO.saveUser(user);
        userList = UserDAO.findAll();
    }

    public void updateUser(int id, User user) {
        UserDAO.editUser(id, user);
    }

    public void updateAccount(int id, User user) {
        UserDAO.updateAccount(id, user);
    }

    public void deleteUser(int id) {
        UserDAO.deleteUser(id);
    }

    public User findUserById(int id) {
        User user = UserDAO.findUserById(id);
        if (user.getIdRole() == 1) {
            user.setRole("user");
        } else {
            user.setRole("admin");
        }
        return user;
    }

    public List<User> findUserByName(String name) {
        userList = UserDAO.findUserByName(name);
        for (User user : userList) {
            if (user.getIdRole() == 1) {
                user.setRole("user");
            } else {
                user.setRole("admin");
            }
        }
        return userList;
    }

}
