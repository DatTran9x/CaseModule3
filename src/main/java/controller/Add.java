package controller;

import model.Cart;
import model.OrderDetail;
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
        RequestDispatcher rd = request.getRequestDispatcher("/view/addUser.jsp");
        rd.forward(request,response);
    }

    void addProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description = request.getParameter("description");
        String img = request.getParameter("img");
        String category = request.getParameter("category");
        boolean status = quantity != 0;
        int idCategory = -1;
        switch (category) {
            case "t-shirt":
                idCategory = 1;
                break;
            case "sweater":
                idCategory = 2;
                break;
            case "jacket":
                idCategory = 3;
                break;
            case "jeans":
                idCategory = 4;
                break;
            case "others":
                idCategory = 5;
                break;
        }
        Product product = new Product(name, price, quantity, description,status, img, idCategory);
        productService.saveProduct(product);
        String message = "Product is added!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("/view/addProduct.jsp");
        rd.forward(request,response);
    }

    void addProductToOrder(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int user_id = Integer.parseInt(request.getParameter("user_id"));
        int product_id = Integer.parseInt(request.getParameter("product_id"));
        Cart cart = new Cart(user_id,product_id);
        cartService.saveCart(cart);
        request.setAttribute("cart",cartService.findAllCart());
        RequestDispatcher rd = request.getRequestDispatcher("/view/addProductToCart.jsp");
        rd.forward(request,response);
    }
}
