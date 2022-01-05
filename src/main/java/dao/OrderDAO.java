package dao;

import model.OrderDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    private static Connection connection = ConnectMySql.getConnection();
    static PreparedStatement preparedStatement;

    public static List<OrderDetail> findAll() {
        String sqlGetAll = "select orderdetail.* , orderDetails.totalPrice as totalPrice, orderDetails.quantity_order as soLuong, users.name_user as khachHang, product.name_product as tenSanPham\n" +
                "from orderdetail\n" +
                "join product on orderdetail.id_product = product.id_product\n" +
                "join orderDetails on orderdetail.id_orders = orderDetails.id_orders\n" +
                "join users on orderDetails.id_users = users.id_users\n" +
                "group by orderDetails.totalPrice, orderDetails.quantity_order,users.name_user";

        try {
            preparedStatement = connection.prepareStatement(sqlGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<OrderDetail> orderDetails = new ArrayList<>();
            while (resultSet.next()) {
                String nameUser = resultSet.getString("name_user");
                String nameProduct = resultSet.getString("product");
                Double totalPrice = resultSet.getDouble("totalPrice");
                int quantity = resultSet.getInt("quantity_order");
                orderDetails.add(new OrderDetail(nameUser,nameProduct,totalPrice,quantity));
            }
            return orderDetails;
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return null;
    }

    public static void saveOrder(OrderDetail orderDetail) {
        String saveSQL = "INSERT INTO orderdetail(id_order,id_product) VALUE (?,?)";

        try {
            preparedStatement = connection.prepareStatement(saveSQL);
            preparedStatement.setInt(1, orderDetail.getIdCart());
            preparedStatement.setInt(2, orderDetail.getIdProduct());
            preparedStatement.execute();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }

    public static void deleteOrder(int id){
        String deleteSQL = "DELETE from orderdetail where id_orderdetail=?";
        try {
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void editOrder(int id, OrderDetail orderDetail) {
        String editSQL = "UPDATE orderdetail set id_orders,id_product where id_orderdetail=?";
        try {
            preparedStatement = connection.prepareStatement(editSQL);

            preparedStatement.setInt(1,orderDetail.getIdCart());
            preparedStatement.setInt(2,orderDetail.getIdProduct());
            preparedStatement.setInt(3,id);

            preparedStatement.execute();
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
    }
}
