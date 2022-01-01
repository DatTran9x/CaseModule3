package controller;

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


    void deleteUser(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(id);
        String message = "User is removed!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request,response);
    }

    void deleteProduct(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteProduct(id);
        String message = "Product is removed!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request,response);
    }
}
