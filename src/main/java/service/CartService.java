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

    public void deleteCart(int idUser) {
        CartDAO.deleteCart(idUser);
    }

    public Cart findById(int idUser) {
        for (Cart cart:cartList) {
            if (cart.getIdUser() == idUser) {
                return cart;
            }
        }
        return null;
    }
}
