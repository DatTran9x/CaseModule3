package controller;

import service.CartService;
import service.ProductService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Delete {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();
    private static final CartService cartService = new CartService();


    void deleteUser(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        userService.deleteUser(id_user);
        response.sendRedirect("/user");
    }

    void deleteProduct(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        productService.deleteProduct(id_product);
        String message = "Product is removed!!";
        request.setAttribute("message",message);
        response.sendRedirect("/admin");
    }

    void deleteCart(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        int id_cart = Integer.parseInt(request.getParameter("id_cart"));
        cartService.deleteCart(id_cart);
        String message = "Cart is removed!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request,response);
    }

}
