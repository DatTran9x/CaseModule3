package service;

import dao.OrderDAO;
import model.OrderDetail;

import java.util.List;

public class OrderDetailService {
    static List<OrderDetail> orderDetailList = OrderDAO.findAll();

    public List<OrderDetail> findAllOrder() {
        return orderDetailList = OrderDAO.findAll();
    }

    public void saveOrder(OrderDetail orderDetail) {
        OrderDAO.saveOrder(orderDetail);
        orderDetailList = OrderDAO.findAll();
    }

    public void updateOrder(int id, OrderDetail orderDetail) {
        OrderDAO.editOrder(id,orderDetail);
    }

    public void deleteOrder(int id) {
        OrderDAO.deleteOrder(id);
    }

    public OrderDetail findById(int id) {
        for (OrderDetail orderDetail:orderDetailList) {
            if (orderDetail.getId() == id) {
                return orderDetail;
            }
        }
        return null;
    }
}
