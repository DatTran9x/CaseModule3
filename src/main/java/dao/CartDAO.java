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

    public static Cart findAll() {
        String sqlGetAll = "select cart.* , users.name_user as users , product.name_product as product, orderDetails.totalPrice as totalPrice\n" +
                "from casemodul3.cart\n" +
                "join product on cart.id_product = product.id_product\n" +
                "join orderdetail on product.id_product = orderdetail.id_product\n" +
                "join orderDetails on orderdetail.id_orders = orderDetails.id_orders\n" +
                "join users on orderDetails.id_users = users.id_users\n" +
                "group by users.name_user,product.name_product,orderDetails.totalPrice";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            Cart cart = new Cart();
            while (resultSet.next()) {
                int id_user = resultSet.getInt("id_user");
                int id_product = resultSet.getInt("id_product");
                String nameUser = resultSet.getString("name_user");
                String nameProduct = resultSet.getString("product");
                Double totalPrice = resultSet.getDouble("totalPrice");
                int id_cart = resultSet.getInt("id_cart");
                int quantity = resultSet.getInt("quantity");
                cart = new Cart(id_cart,id_user, id_product, nameUser, nameProduct, totalPrice,quantity);
            }
            return cart;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }

    public static void saveCart(Cart cart) {
        String saveSQL = "INSERT INTO cart(id_users,id_product) VALUE (?,?)";
        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setInt(1, cart.getIdUser());
            preparedStatement.setInt(2, cart.getIdProduct());
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

    public static Cart findAllByUser(int user_id) {
        String findAllCartByUserSQL = "select cart.* , users.name_user as users , product.name_product as product, orderDetails.totalPrice as totalPrice\n" +
                "from casemodul3.cart\n" +
                "join product on cart.id_product = product.id_product\n" +
                "join orderdetail on product.id_product = orderdetail.id_product\n" +
                "join orderDetails on orderdetail.id_orders = orderDetails.id_orders\n" +
                "join users on orderDetails.id_users = users.id_users\n" +
                "group by users.name_user,product.name_product,orderDetails.totalPrice where id_user=?";
        Cart cart = new Cart();
        try {
            preparedStatement = connection.prepareStatement(findAllCartByUserSQL);
            preparedStatement.setInt(1, user_id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id_user = rs.getInt("id_user");
                int id_product = rs.getInt("id_product");
                String nameUser = rs.getString("name_user");
                String nameProduct = rs.getString("product");
                Double totalPrice = rs.getDouble("totalPrice");
                cart = new Cart(id_user, id_product, nameUser, nameProduct, totalPrice);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cart;
    }

    public static void editCart(Cart cart) {
        
    }
}
