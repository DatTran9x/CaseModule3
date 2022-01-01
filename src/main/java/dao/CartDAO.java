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

            List<Cart> cartList = new ArrayList<>();
            while (resultSet.next()) {
                String nameUser = resultSet.getString("name_user");
                String nameProduct = resultSet.getString("product");
                Double totalPrice = resultSet.getDouble("totalPrice");
                cartList.add(new Cart(nameUser,nameProduct,totalPrice));
            }
            return cartList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }

    public static void saveCart(Cart cart) {
        String saveSQL = "INSERT INTO cart(id_users,id_product) VALUE (?,?)";

        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setInt(1,cart.getIdUser());
            preparedStatement.setInt(2,cart.getIdProduct());
            preparedStatement.execute();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteCart(int id){
        String deleteSQL = "DELETE from cart where id_cart=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
