package dao;

import model.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAO {
    private static Connection connection = ConnectMySql.getConnection();
    static PreparedStatement preparedStatement;

    public static List<Cart> findAll() {
        String sqlGetAll = "SELECT * FROM cart c join product p where c.id_product = p.id_product;";
        List<Cart> list = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            Cart cart = new Cart();
            while (resultSet.next()) {
                int id_user = resultSet.getInt("id_users");
                int id_product = resultSet.getInt("id_product");
                int id_cart = resultSet.getInt("id_cart");
                int quantity = resultSet.getInt("quantity");
                String productName = resultSet.getString("name_product");
                int price = resultSet.getInt("price");
                cart = new Cart(id_cart,id_user, id_product,quantity);
                cart.setNameProduct(productName);
                cart.setPrice(price);
                cart.setTotalPrice(price*quantity);
                list.add(cart);
            }
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return list;
    }

    public static void saveCart(Cart cart) {
        String saveSQL = "INSERT INTO cart(id_product,quantity) VALUE (?,?)";
        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setInt(1, cart.getIdProduct());
            preparedStatement.setInt(2,cart.getQuantity());
            preparedStatement.execute();
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteCart(int id) {
        String deleteSQL = "DELETE from cart where id_cart=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Cart> findAllByUser(int user_id) {
        String findAllCartByUserSQL = "SELECT * FROM cart c join product p where c.id_product = p.id_product" +
                "where id_user=?";
        List<Cart> list = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(findAllCartByUserSQL);
            preparedStatement.setInt(1, user_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id_user = resultSet.getInt("id_user");
                int id_product = resultSet.getInt("id_product");
                int id_cart = resultSet.getInt("id_cart");
                int quantity = resultSet.getInt("quantity");
                String productName = resultSet.getString("name_product");
                int price = resultSet.getInt("price");
                Cart cart = new Cart(id_cart,id_user, id_product,quantity);
                cart.setNameProduct(productName);
                cart.setPrice(price);
                cart.setTotalPrice(price*quantity);
                list.add(cart);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public static void editCart(Cart cart) {
        String editCartSQL = "update cart set quantity = ? where id_cart = ?;";
        try {
            preparedStatement = connection.prepareStatement(editCartSQL);
            preparedStatement.setInt(1,cart.getQuantity());
            preparedStatement.setInt(2,cart.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void payment() throws SQLException {
        String dropSQL = "drop table cart";
        String createSQL = "create table cart\n" +
                "(\n" +
                "  id_users int,\n" +
                "  id_product int,\n" +
                "  id_cart int primary key auto_increment,\n" +
                "  quantity int,\n" +
                "  foreign key(id_users) references users(id_users),\n" +
                "  foreign key(id_product) references product(id_product)\n" +
                "); ";
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(dropSQL);
            preparedStatement.execute();
            preparedStatement = connection.prepareStatement(createSQL);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.rollback();
        }
    }
}
