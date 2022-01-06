package controller;

import model.Cart;
import model.Product;
import service.CartService;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/cart")
public class CartServlet extends HttpServlet {
    private static final CartController cartController = new CartController();
    private static final CartService cartService = new CartService();
    private static final ProductService productService = new ProductService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "plus":
                cartController.plus(req, resp);
                break;
            case "minus":
                cartController.minus(req, resp);
                break;
            case "delete":
                cartController.delete(resp,req);
                break;
            case "payment":
                try {
                    cartController.payment(req,resp);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                List<Cart> list = cartService.findAllCart();
                int totalPrice = 0;
                for (Cart c:list) {
                    totalPrice += c.getTotalPrice();
                }
                req.setAttribute("totalPrice",totalPrice);
                req.setAttribute("list",cartService.findAllCart());
                RequestDispatcher rd = req.getRequestDispatcher("/view/cart.jsp");
                rd.forward(req,resp);
        }
    }
}
