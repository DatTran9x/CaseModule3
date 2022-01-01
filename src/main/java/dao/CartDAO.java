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
        String sqlGetAll = "select cart.* , users.name_user as users , product.name_product as product, orders.totalPrice as totalPrice\n" +
                "from casemodul3.cart\n" +
                "join product on cart.id_product = product.id_product\n" +
                "join orderdetail on product.id_product = orderdetail.id_product\n" +
                "join orders on orderdetail.id_orders = orders.id_orders\n" +
                "join users on orders.id_users = users.id_users\n" +
                "group by users.name_user,product.name_product,orders.totalPrice";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cart> cartList = new ArrayList<>();
            while (resultSet.next()) {
                int idUser = resultSet.getInt("id_user");
                int idProduct = resultSet.getInt("id_product");
                String nameUser = resultSet.getString("name_user");
                String nameProduct = resultSet.getString("product");
                Double totalPrice = resultSet.getDouble("totalPrice");
                cartList.add(new Cart(idUser,idProduct,nameUser,nameProduct,totalPrice));
            }
            return cartList;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }

    public static void saveCart(Cart cart) {
        String saveSQL = "INSERT INTO cart(id_user,id_product) VALUE (?,?)";

        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setInt(1,cart.getIdUser());
            preparedStatement.setInt(2,cart.getIdProduct());
            preparedStatement.execute();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteCart(int idUser){
        String deleteSQL = "DELETE from cart where id_user=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1,idUser);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
