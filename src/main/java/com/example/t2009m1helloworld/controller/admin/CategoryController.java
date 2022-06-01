package com.example.t2009m1helloworld.controller.admin;

import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.myenum.CategoryStatus;
import com.example.t2009m1helloworld.model.MySqlAccountModel;
import com.example.t2009m1helloworld.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CategoryController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        if(name.isEmpty()){
            req.setAttribute("error","Name is required");
            req.getRequestDispatcher("/admin/views/category/form.jsp").forward(req,resp);
            return;
        }
        int categoryStatus = 0;
        if(status == "on"){
            categoryStatus =1;
        }
        Category category = new Category();
        category.setName(name);
        category.setStatus(categoryStatus);
        MySqlCategoryModel mySqlCategoryModel = new MySqlCategoryModel();
        mySqlCategoryModel.Save(category);
        req.getRequestDispatcher("/admin/views/category/list.jsp").forward(req,resp);
    }
}

