package controller;

import model.Cart;
import model.Product;
import model.User;
import service.CartService;
import service.OrderDetailService;
import service.ProductService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Add {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();
    private static final CartService cartService = new CartService();
    private static final OrderDetailService orderDetailService = new OrderDetailService();

    void addUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        int id = 1;
        if (role.equalsIgnoreCase("admin")) {
            id = 0;
        }
        User user = new User(name, phoneNumber, email, password, id);
        userService.saveUser(user);
        String message = "User id added!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("/admin");
        rd.forward(request,response);
    }

    void addProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String img = request.getParameter("img");
        String category = request.getParameter("category");
        boolean status = quantity != 0;
        int idCategory = -1;
        switch (category) {
            case "T-SHIRT":
                idCategory = 1;
                break;
            case "SWEATER":
                idCategory = 2;
                break;
            case "JACKET":
                idCategory = 3;
                break;
            case "JEANS":
                idCategory = 4;
                break;
            case "OTHERS":
                idCategory = 5;
                break;
        }
        Product product = new Product(name, price, quantity, description,status, img, idCategory);
        productService.saveProduct(product);
        String message = "Product is added!!";
        request.setAttribute("message",message);
        response.sendRedirect("/admin");
    }

    void addProductToCart(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int product_id = Integer.parseInt(request.getParameter("id_product"));
        Cart cart = new Cart(product_id);
        cartService.saveCart(cart);
        List<Product> list = productService.findAllProduct();
        request.setAttribute("list",cartService.findAllCart());
        request.setAttribute("cart",cartService.findAllCart());
        response.sendRedirect("/cart");
    }
}
