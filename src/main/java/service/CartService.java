package service;

import dao.CartDAO;
import model.Cart;
import model.OrderDetail;
import model.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartService {
    private static List<Cart> list = new ArrayList<>();
    static ProductService productService = new ProductService();

    public List<Cart> findAllCart() {
        return CartDAO.findAll();
    }

    public void saveCart(Cart cart) {
        cart.setQuantity(1);
        CartDAO.saveCart(cart);
    }

    public List<Cart> findAllCartById(int user_id) {
        return CartDAO.findAllByUser(user_id);
    }

    public void deleteCart(int id) {
        CartDAO.deleteCart(id);
    }

    public List<Cart> findById(int id) {
        return CartDAO.findAllByUser(id);
    }

    public void plus(Cart cart) {
        list = findAllCart();
        for (Cart c : list) {
            if (c.getIdProduct() == cart.getIdProduct()) {
                c.setQuantity(c.getQuantity() + 1);
                CartDAO.editCart(c);
                return;
            }
        }
        cart.setQuantity(1);
        CartDAO.saveCart(cart);
    }

    public void payment() throws SQLException {
        CartDAO.payment();
    }

    public void minus(Cart cart) {
        list = findAllCart();
        for (Cart c : list) {
            if (c.getIdProduct() == cart.getIdProduct()) {
                cart.setQuantity(c.getQuantity() - 1);
                cart.setId(c.getId());
            }
        }
        if (cart.getQuantity() > 1)
            CartDAO.editCart(cart);
        else CartDAO.deleteCart(cart.getId());
    }
}
