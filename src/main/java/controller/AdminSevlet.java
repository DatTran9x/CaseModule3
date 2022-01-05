package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdminServlet", value = "/admin")
public class AdminSevlet extends HttpServlet {
    private static final Show show = new Show();
    private static final Add add = new Add();
    private static final Edit edit = new Edit();
    private static final Delete delete = new Delete();
    private static final Find find = new Find();
    private static final Sort sort = new Sort();

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
                delete.deleteProduct(response, request);
                break;
            case "sortUp":
                sort.sortUp(response,request);
                break;
            case "sortDown":
                sort.sortDown(request,response);
                break;
            default:
                show.showAdmin(request,response);
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
