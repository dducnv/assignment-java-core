package com.example.t2009m1helloworld.controller;

import com.example.t2009m1helloworld.entity.Account;
import com.example.t2009m1helloworld.model.MySqlAccountModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/views/product/list.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email    = req.getParameter("email");
        String phone    = req.getParameter("phone");
        String username = req.getParameter("username");
        String birthday = req.getParameter("birthday");
        String password = req.getParameter("password");
        Account account = new Account();
        account.setFullName(fullName);
        account.setEmail(email);
        account.setPhone(phone);
        account.setUsername(username);
        account.setBirthday(birthday);
        account.setPassword(password);
        if(!account.isValid()){
            req.setAttribute("account",account);
            req.setAttribute("error",account.getError());
            req.getRequestDispatcher("/auth/register.jsp").forward(req,resp);
            return;
        }
        MySqlAccountModel mySqlAccountModel = new MySqlAccountModel();
        boolean result = mySqlAccountModel.Save(account);
        if(result){
            req.setAttribute("account",account);
            req.getRequestDispatcher("/notify-page/register-success.jsp").forward(req,resp);
        }
        req.getRequestDispatcher("/auth/register.jsp").forward(req,resp);

    }
}
