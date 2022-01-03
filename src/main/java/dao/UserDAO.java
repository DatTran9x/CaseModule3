package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final static Connection connection = ConnectMySql.getConnection();
    static PreparedStatement preparedStatement;

    public static List<User> findAll() {
        String sqlGetAll = "SELECT * FROM users";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<User> userList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_users");
                String name = resultSet.getString("name_user");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                userList.add(new User(id, name, phoneNumber, email, password));
            }
            return userList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }

    public static void saveUser(User user) {
        String saveSQL = "INSERT INTO users(name_user,phoneNumber,email,password) VALUE (?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhoneNumber());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.execute();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteUser(int id) {
        String deleteSQL = "DELETE from users where id=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editUser(int id, User user) {
        String editSQL = "UPDATE users set name_user=?, phoneNumber=? where id=?";
        try {
            preparedStatement = connection.prepareStatement(editSQL);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhoneNumber());
            preparedStatement.setInt(3, id);
            preparedStatement.execute();
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }


    public static User findUserById(int id) {
        String sqlFindById = "SELECT name_user,phoneNumber,email,password FROM users where id=?";
        User user = null;
        try {
            preparedStatement = connection.prepareStatement(sqlFindById);
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setInt(1, id);
            while (resultSet.next()) {
                String name = resultSet.getString("name_users");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int idRole = resultSet.getInt("id_role");

                user = new User(id, name, phoneNumber, email, password, idRole);
            }

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return user;
    }

    public static List<User> findUserByName(String name) {
        String sqlFindByName = "SELECT * FROM casemodul3.users WHERE name_user LIKE ?;";
        User user = null;
        List<User> userList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sqlFindByName);
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setString(1, "'%" + name + "%'");
            while (resultSet.next()) {
                String name_users = resultSet.getString("name_users");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int id = resultSet.getInt("id_users");
                int idRole = resultSet.getInt("id_role");
                user = new User(id, name_users, phoneNumber, email, password, idRole);
                userList.add(user);
            }

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return userList;
    }

    public static void updateAccount(int id, User user) {
        String editSQL = "UPDATE users set email=?, password=? where id=?";
        try {
            preparedStatement = connection.prepareStatement(editSQL);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, id);
            preparedStatement.execute();
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }
}
