package controller;

import model.Cart;
import model.Product;
import model.User;
import service.CartService;
import service.ProductService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Find {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();
    private static final CartService cartService = new CartService();

    void findUser(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<User> user = userService.findUserByName(name);
        request.setAttribute("user",user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/findUser.jsp");
        requestDispatcher.forward(request,response);
    }

    void findProduct(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Product> product = productService.findProductByName(name);
        request.setAttribute("product",product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/details.jsp");
        requestDispatcher.forward(request,response);
    }

    void findCart(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        Cart cart =  cartService.findAllCartById(id_user);
        request.setAttribute("cart",cart);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/cart.jsp");
        requestDispatcher.forward(request,response);
    }
}
