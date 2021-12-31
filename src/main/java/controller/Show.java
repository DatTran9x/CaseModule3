package controller;

import model.Product;
import model.User;
import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Show {
    private static final Service service = new Service();

    void showUserList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = service.getUserList();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("/view/showLUserList.jsp");
        rd.forward(request, response);
    }

    void showProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = service.getProductList();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("/view/showLProductList.jsp");
        rd.forward(request, response);
    }

    void showUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = service.getUser(id);
        request.setAttribute("user", user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/showUser.jsp");
        rd.forward(request, response);
    }

    void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.getProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/showProduct.jsp");
        rd.forward(request, response);
    }

    void showAddUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/view/addUser.jsp");
        rd.forward(request,response);
    }

    void showAddProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd =request.getRequestDispatcher("/view/addProduct.jsp");
        rd.forward(request,response);
    }

    void showEditUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = service.getUser(id);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editUser.jsp");
        rd.forward(request,response);
    }

    void showEditAccountForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = service.getUser(id);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editAccount.jsp");
        rd.forward(request,response);
    }

    void showEditProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.getProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editProduct.jsp");
        rd.forward(request, response);
    }

    void showDeleteUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = service.getUser(id);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/deleteUser.jsp");
        rd.forward(request,response);
    }

    void showDeleteProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.getProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/deleteProduct.jsp");
        rd.forward(request, response);
    }
}
