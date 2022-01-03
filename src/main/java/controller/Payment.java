package controller;

import service.CartService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Payment {
    private static final CartService cartService = new CartService();

    void payCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        double money = Integer.parseInt(request.getParameter("money"));
        double change = cartService.payment(money,id_user);
        cartService.deleteCart(id_user);
        request.setAttribute("change",change);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/payment.jsp");
        requestDispatcher.forward(request,response);
    }

}
