package com.example.t2009m1helloworld.controller.admin;

import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.model.sql_modal.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CategoryController extends HttpServlet {
    private MySqlCategoryModel categoryModal;
    @Override
    public void init() throws ServletException {
        categoryModal = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categories = categoryModal.getAll();
        req.setAttribute("categories", categories);
        req.getRequestDispatcher("/admin/views/category/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/admin/views/category/list.jsp").forward(req,resp);
    }
}

