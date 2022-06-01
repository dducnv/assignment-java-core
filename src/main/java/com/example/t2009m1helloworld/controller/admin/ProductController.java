package com.example.t2009m1helloworld.controller.admin;

import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.model.MySqlProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String thumbnail = req.getParameter("thumbnail");
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        String details = req.getParameter("details");
        Product product = new Product();
        product.setTitle(title);
        product.setThumbnail(thumbnail);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setDetails(details);
        product.setThumbnail(thumbnail);
        MySqlProductModel mySqlProductModel = new MySqlProductModel();
        mySqlProductModel.Save(product);
        req.getRequestDispatcher("/admin/views/product/list.jsp").forward(req,resp);
    }
}
