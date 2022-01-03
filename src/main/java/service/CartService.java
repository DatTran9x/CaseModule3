package service;

import dao.CartDAO;
import model.Cart;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    static List<Cart> cartList = CartDAO.findAll();
    static List<Product> productList = new ArrayList<>();
    static ProductService productService = new ProductService();

    public List<Cart> findAllCart() {
        return cartList = CartDAO.findAll();
    }

    public void saveCart(Cart cart) {
        CartDAO.saveCart(cart);
        cartList = CartDAO.findAll();
    }

    public List<Cart> findAllCartById(int user_id){
        return CartDAO.findAllByUser(user_id);
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

    public void editCart(Cart cart) {
        CartDAO.editCart(cart);
    }
}
