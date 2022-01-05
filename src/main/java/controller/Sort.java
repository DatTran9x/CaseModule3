package controller;

import model.Product;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Sort {
    private static final ProductService pS = new ProductService();

    public void sortUp(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        List<Product> list = pS.sortUp();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("/view/adminhome.jsp");
        rd.forward(request, response);
    }

    public void sortDown(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = pS.sortDown();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("/view/adminhome.jsp");
        rd.forward(request, response);
    }
}
