package com.example.t2009m1helloworld.controller.admin;

import com.example.t2009m1helloworld.entity.Category;
import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.model.MySqlCategoryModel;
import com.example.t2009m1helloworld.model.MySqlProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductController extends HttpServlet {
    private MySqlProductModel productModel;
    @Override
    public void init() throws ServletException {
        productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productModel.getAll();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/admin/views/product/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String thumbnail = req.getParameter("thumbnail");
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        int category_id = Integer.parseInt(req.getParameter("category_id"));
        String details = req.getParameter("details");
        Product product = new Product();
        product.setTitle(title);
        product.setThumbnail(thumbnail);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setDetails(details);
        product.setCategoryId(category_id);
        product.setThumbnail(thumbnail);
        product.setStatus(1);
        productModel.Save(product);
        req.getRequestDispatcher("/admin/views/product/list.jsp").forward(req,resp);
    }
}
