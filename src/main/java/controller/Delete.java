package controller;

import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Delete {
    private final static Service service = new Service();

    void deleteUser(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        service.deleteUser(id);
        String message = "User is removed!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request,response);
    }

    void deleteProduct(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        service.deleteProduct(id);
        String message = "Product is removed!!";
        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("home");
        rd.forward(request,response);
    }
}
