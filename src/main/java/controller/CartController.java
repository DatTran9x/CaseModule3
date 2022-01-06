package controller;

import dao.CartDAO;
import model.Cart;
import service.CartService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CartController {
    private static final CartService cartService = new CartService();

    void plus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        Cart cart = new Cart(id_product);
        cartService.plus(cart);
        List<Cart> list = cartService.findAllCart();
        request.setAttribute("list",list);
        response.sendRedirect("/cart");
    }

    void minus(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        Cart cart = new Cart(id_product);
        cartService.minus(cart);
        List<Cart> list = cartService.findAllCart();
        request.setAttribute("list",list);
        response.sendRedirect("/cart");
    }

    void delete(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        int id_cart = Integer.parseInt(request.getParameter("id_cart"));
        cartService.deleteCart(id_cart);
        List<Cart> list = cartService.findAllCart();
        request.setAttribute("list",list);
       response.sendRedirect("/cart");
    }

    public void payment(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
        cartService.payment();
        resp.sendRedirect("/home");
    }
}
