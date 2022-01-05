package dao;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final static Connection connection = ConnectMySql.getConnection();
    private static PreparedStatement preparedStatement;

    public static List<Product> findAll() {
        String sqlGetAll = "SELECT * FROM product";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_product");
                String name = resultSet.getString("name_product");
                Double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String motasp = resultSet.getString("motasp");
                boolean status = resultSet.getBoolean("status");
                String img = resultSet.getString("img");

                productList.add(new Product(id,name,price,quantity,motasp,status,img));
            }
            return productList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }

        return null;
    }

    public static void saveProduct(Product product) {
        String saveSQL = "INSERT INTO product(name_product,price,status,quantity,motasp,img) VALUE (?,?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setBoolean(3,product.isStatus());
            preparedStatement.setInt(4,product.getQuantity());
            preparedStatement.setString(5,product.getMotasp());
            preparedStatement.setString(6,product.getImg());
            preparedStatement.execute();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteProduct(int id){
        String deleteSQL = "DELETE from product where id_product=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void editProduct(int id, Product product) {
        String editSQL = "UPDATE product set name_product=?, price=?, status=?, quantity=?, motasp=?, img=? where id_product=?";
        try {
            preparedStatement = connection.prepareStatement(editSQL);

            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setBoolean(3,product.isStatus());
            preparedStatement.setInt(4,product.getQuantity());
            preparedStatement.setString(5,product.getMotasp());
            preparedStatement.setString(6,product.getImg());
            preparedStatement.setInt(7,id);

            preparedStatement.execute();
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static List<Product> findProductByName(String nameFind) {
        String sqlFindById = "SELECT product.*, category.name_category as category FROM product join category on product.id_category = category.id_category " +
                "where product.name_product like '%"+nameFind+"%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlFindById);
            List<Product> productList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_product");
                String name = resultSet.getString("name_product");
                Double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String motasp = resultSet.getString("motasp");
                boolean status = resultSet.getBoolean("status");
                String img = resultSet.getString("img");
                String nameCategory = resultSet.getString("category");
                int idCategory = resultSet.getInt("id_category");

                productList.add(new Product(id,name,price,quantity,motasp,status,img,nameCategory,idCategory));
            }
            return productList;

        } catch (Exception throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }
}
