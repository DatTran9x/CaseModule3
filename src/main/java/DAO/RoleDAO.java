package dao;

import model.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO {
    private static Connection connection = ConnectMySql.getConnection();
    static PreparedStatement preparedStatement;

    public static List<Role> findAll() {
        String sqlGetAll = "SELECT * FROM role";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Role> roleList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_category");
                boolean status = resultSet.getBoolean("status");
                roleList.add(new Role(id,status));
            }
            return roleList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }
}
