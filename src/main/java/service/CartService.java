package service;

import dao.CartDAO;
import model.Cart;

import java.util.List;

public class CartService {
    static List<Cart> cartList = CartDAO.findAll();

    public List<Cart> findAllCart() {
        return cartList = CartDAO.findAll();
    }

    public void saveCart(Cart cart) {
        CartDAO.saveCart(cart);
        cartList = CartDAO.findAll();
    }

    public void deleteCart(int id) {
        CartDAO.deleteCart(id);
    }

    public Cart findById(int id) {
        for (Cart cart:cartList) {
            if (cart.getId() == id) {
                return cart;
            }
        }
        return null;
    }
}
