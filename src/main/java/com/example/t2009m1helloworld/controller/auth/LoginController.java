package com.example.t2009m1helloworld.controller.auth;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private AccountService accountService;

    public LoginController() {
        accountService = new AccountService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account account = accountService.login(username, password);
        if (account == null) {
            req.setAttribute("error", "Username or password is incorrect");
            req.getRequestDispatcher("/auth/login.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("currentAccount", account);
            resp.sendRedirect("/");
        }
    }
}
