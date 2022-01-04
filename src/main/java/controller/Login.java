package controller;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Login {
    private static final UserService userService = new UserService();

    void logIn(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password  = request.getParameter("password");
        List<User> list =   userService.findAllUser();
        RequestDispatcher requestDispatcher;
        for (User user:list) {
            if(user.getEmail().equals(username)&&user.getPassword().equals(password)){
                requestDispatcher =  request.getRequestDispatcher("home");
                requestDispatcher.forward(request,response);
            }
        }
        requestDispatcher = request.getRequestDispatcher("/view/login.jsp");
        requestDispatcher.forward(request,response);
    }

    void signIn(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password  = request.getParameter("password");
        User user = new User(username,password);
        userService.saveUser(user);
        RequestDispatcher  requestDispatcher = request.getRequestDispatcher("/view/login.jsp");
        requestDispatcher.forward(request,response);
    }

    void logOut(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/login.jsp");
        requestDispatcher.forward(request,response);
    }
}
