package service;

import dao.OrderDAO;
import model.OrderDetail;

import java.util.ArrayList;
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

    public static List<OrderDetail> findById(int id) {
        orderDetailList = OrderDAO.findAll();
        List<OrderDetail> list = new ArrayList<>();
        for (OrderDetail orderDetail:orderDetailList) {
            if (orderDetail.getId() == id) {
                list.add(orderDetail);
            }
        }
        return list;
    }
}
