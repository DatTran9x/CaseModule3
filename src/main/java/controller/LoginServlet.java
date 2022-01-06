package controller;

import model.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("Username");
        String password = req.getParameter("Password");
        if (username == null) username = "";
        if (password == null) password = "";
        List<User> list = userService.findAllUser();
        for (User user : list) {
            if (user.getEmail() == null || user.getPassword() == null) continue;
            if (user.getEmail().equals(username) && user.getPassword().equals(password)) {
                resp.sendRedirect("/home");
                return;
            }
        }
        if (username.equals("admin") && password.equals("admin")) {
           resp.sendRedirect("/admin");
        } else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        requestDispatcher = req.getRequestDispatcher("/view/login.jsp");
        requestDispatcher.forward(req, resp);
    }
}

