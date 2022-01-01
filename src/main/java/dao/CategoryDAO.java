package dao;

import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    private static Connection connection = ConnectMySql.getConnection();
    static PreparedStatement preparedStatement;

    public static List<Category> findAll() {
        String sqlGetAll = "SELECT * FROM category";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Category> categoryList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_category");
                String name = resultSet.getString("name_category");
                categoryList.add(new Category(id,name));
            }
            return categoryList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }
}
