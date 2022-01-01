package controller;

import model.Product;
import model.User;
import service.ProductService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Find {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();

    void findUser(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("name");
        User user = userService.findUserByName(name);
        request.setAttribute("user",user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/findUser.jsp");
        requestDispatcher.forward(request,response);
    }

    void findProduct(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("name");
        Product product = productService.findProductByName(name);
        request.setAttribute("product",product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/findUser.jsp");
        requestDispatcher.forward(request,response);
    }
}
