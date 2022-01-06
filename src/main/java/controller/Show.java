package controller;

import dao.ProductDAO;
import model.Product;
import model.User;
import service.ProductService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Show {
    private static final UserService userService = new UserService();
    private static final ProductService productService = new ProductService();

    void showUserList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = userService.findAllUser();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("/view/userlist.jsp");
        rd.forward(request, response);
    }

    void showProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String indexPage = request.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);

        RequestDispatcher requestDispatcher = null;
        ProductDAO productDAO = new ProductDAO();
        int count = productDAO.getTotalProduct();
        int endPage = count/5;
        if (count %5 != 0 ) {
            endPage++;
        }
        List<Product> list = ProductDAO.pagingProduct(index);

        request.setAttribute("list",list);
        request.setAttribute("page",endPage);
        requestDispatcher=request.getRequestDispatcher("/view/home.jsp");
        requestDispatcher.forward(request,response);
    }

    void showAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String indexPage = request.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);

        RequestDispatcher requestDispatcher = null;
        ProductDAO productDAO = new ProductDAO();
        int count = productDAO.getTotalProduct();
        int endPage = count/5;
        if (count %5 != 0 ) {
            endPage++;
        }
        List<Product> list = ProductDAO.pagingProduct(index);

        request.setAttribute("list",list);
        request.setAttribute("page",endPage);
        RequestDispatcher rd = request.getRequestDispatcher("/view/adminhome.jsp");
        rd.forward(request, response);
    }

    void showUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        User user = userService.findUserById(id_user);
        request.setAttribute("user", user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/showUser.jsp");
        rd.forward(request, response);
    }

    void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        Product product = productService.findById(id_product);
        request.setAttribute("list", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/details.jsp");
        rd.forward(request, response);
    }

    void showAddUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/view/addUser.jsp");
        rd.forward(request,response);
    }

    void showAddProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd =request.getRequestDispatcher("/view/create.jsp");
        rd.forward(request,response);
    }

    void showEditUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        User user = userService.findUserById(id_user);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/edituser.jsp");
        rd.forward(request,response);
    }

    void showEditAccountForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        User user = userService.findUserById(id_product);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/editAccount.jsp");
        rd.forward(request,response);
    }

    void showEditProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        Product product = productService.findById(id_product);
        request.setAttribute("product", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/edit.jsp");
        rd.forward(request, response);
    }

    void showDeleteUserForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_user = Integer.parseInt(request.getParameter("id_user"));
        User user = userService.findUserById(id_user);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/view/deleteUser.jsp");
        rd.forward(request,response);
    }

    void showDeleteProductForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id_product = Integer.parseInt(request.getParameter("id_product"));
        Product product = productService.findById(id_product);
        request.setAttribute("product", product);
        RequestDispatcher rd = request.getRequestDispatcher("/view/delete.jsp");
        rd.forward(request, response);
    }
}
