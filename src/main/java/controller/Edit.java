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

public class Edit {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();
    private static final CartService cartService = new CartService();

    void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        userService.updateUser(id,user);
        user = userService.findUserById(id);
        request.setAttribute("user", user);
        String message = "User is updated!!";
        request.setAttribute("message", message);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/editUser.jsp");
        requestDispatcher.forward(request, response);
    }

    void editAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setEmail(username);
        user.setPassword(password);
        userService.updateAccount(id,user);
        user = userService.findUserById(id);
        request.setAttribute("user", user);
        String message = "Account is updated!!";
        request.setAttribute("message", message);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editAccount.jsp");
        rd.forward(request, response);
    }

    void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description = request.getParameter("description");
        String img = request.getParameter("img");
        boolean status = quantity != 0;
        int idCategory = 0;
        String category = request.getParameter("category");
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
        Product product = new Product(name, price, quantity, description, status, img, idCategory);
        productService.updateProduct(id,product);
        request.setAttribute("product", product);
        String message = "Product is updated!!";
        request.setAttribute("message", message);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editProduct.jsp");
        rd.forward(request, response);
    }

    void editCart(HttpServletRequest request,HttpServletResponse response){
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        String name_user = request.getParameter("name_user");
        int id_cart = Integer.parseInt(request.getParameter("id_cart"));
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        String name_product = request.getParameter("name_product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Cart cart = new Cart(id_user,id_product,name_user,name_product);
        cart.setId(id_cart);
        cartService.editCart(cart);
    }
}
