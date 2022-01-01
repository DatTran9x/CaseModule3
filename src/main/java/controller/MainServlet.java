package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/home")
public class MainServlet extends HttpServlet {
    private static final Show show = new Show();
    private static final Add add = new Add();
    private static final Edit edit = new Edit();
    private static final Delete delete = new Delete();
    private static final Find find = new Find();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "showUserList":
                show.showUserList(request,response);
                break;
            case "showUser":
                show.showUser(request, response);
                break;
            case "showProduct":
                show.showProduct(request, response);
                break;
            case "showAddUserForm":
                show.showAddUserForm(request, response);
                break;
            case "showAddProductForm":
                show.showAddProductForm(request, response);
                break;
            case "showEditUserForm" :
                show.showEditUserForm(request, response);
                break;
            case "showEditAccountForm":
                show.showEditAccountForm(request, response);
                break;
            case "showEditProductForm":
                show.showEditProductForm(request, response);
                break;
            case "showDeleteUserForm":
                show.showDeleteUserForm(request, response);
                break;
            case "showDeleteProductForm":
                show.showDeleteProductForm(request, response);
                break;
            default:
            show.showProductList(request,response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "addUser":
                add.addUser(request, response);
                break;
            case "addProduct":
                add.addProduct(request,response);
                break;
            case "editUser":
                edit.editUser(request, response);
                break;
            case "editAccount":
                edit.editAccount(request, response);
                break;
            case "editProduct":
                edit.editProduct(request, response);
                break;
            case "deleteUser":
                delete.deleteUser(response, request);
                break;
            case "deleteProduct":
                delete.deleteProduct(response, request);
                break;
            case "findUser":
                find.findUser(response, request);
                break;
            case "findProduct" :
                find.findProduct(response, request);
                break;
        }
    }
}
