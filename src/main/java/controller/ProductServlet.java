package controller;

import dao.ProductDAO;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/page")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String indexPage = req.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);

        RequestDispatcher requestDispatcher = null;
        ProductDAO productDAO = new ProductDAO();
        int count = productDAO.getTotalProduct();
        int endPage = count / 5;
        if (count % 5 != 0) {
            endPage++;
        }
        List<Product> list = ProductDAO.pagingProduct(index);

        req.setAttribute("list", list);
        req.setAttribute("page", endPage);
        requestDispatcher = req.getRequestDispatcher("/view/home.jsp");
        requestDispatcher.forward(req, resp);
    }
}
