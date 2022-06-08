package com.example.t2009m1helloworld.controller.auth;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.entity.myenum.AccountStatus;
import com.example.t2009m1helloworld.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    private AccountService accountService;

    public RegisterController() {
        accountService = new AccountService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setConfirmPassword(confirmPassword);
        account.setRoleID(1);
        account.setStatus(AccountStatus.ACTIVE);
        account = accountService.register(account);
        req.getSession().setAttribute("account", account);
        req.getRequestDispatcher("/auth/register.jsp").forward(req, resp);
    }
}
