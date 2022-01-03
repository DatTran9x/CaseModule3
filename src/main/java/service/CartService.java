package service;

import dao.CartDAO;
import model.Cart;
import model.OrderDetail;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    Cart cart;
    static ProductService productService = new ProductService();

    public Cart findAllCart() {
        cart = CartDAO.findAll();
        int id_cart = cart.getId();
        List<OrderDetail> list = OrderDetailService.findById(id_cart);
        double totalPrice=0;
        for (OrderDetail od : list) {
            int quantity = od.getQuantity();
            int id_product = od.getIdProduct();
            Product product = productService.findById(id_product);
            double price = product.getPrice();
            od.setTotalPrice(price*quantity);
            totalPrice = totalPrice+(price*quantity);
        }
        cart.setTotalPrice(totalPrice);
        return cart;
    }

    public void saveCart(Cart cart) {
        CartDAO.saveCart(cart);
    }

    public Cart findAllCartById(int user_id) {
        return CartDAO.findAllByUser(user_id);
    }

    public void deleteCart(int id) {
        CartDAO.deleteCart(id);
    }

    public Cart findById(int id) {
        cart = CartDAO.findAllByUser(id);
        int id_cart = cart.getId();
        List<OrderDetail> list = OrderDetailService.findById(id_cart);
        double totalPrice=0;
        for (OrderDetail od : list) {
            int quantity = od.getQuantity();
            int id_product = od.getIdProduct();
            Product product = productService.findById(id_product);
            double price = product.getPrice();
            od.setTotalPrice(price*quantity);
            totalPrice = totalPrice+(price*quantity);
        }
        cart.setTotalPrice(totalPrice);
        return cart;
    }

    public void editCart(Cart cart) {
        CartDAO.editCart(cart);
    }

    public double payment(double money, int id_user) {
        cart = findById(id_user);
        int id_cart = cart.getId();
        List<OrderDetail> list = OrderDetailService.findById(id_cart);
        double totalPrice=0;
        for (OrderDetail od : list) {
            int quantity = od.getQuantity();
            int id_product = od.getIdProduct();
            Product product = productService.findById(id_product);
            double price = product.getPrice();
            od.setTotalPrice(price*quantity);
            totalPrice = totalPrice+(price*quantity);
        }
        cart.setTotalPrice(totalPrice);
        return totalPrice-money;
    }
}
