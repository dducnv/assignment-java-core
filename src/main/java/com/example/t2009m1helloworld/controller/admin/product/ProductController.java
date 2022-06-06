package com.example.t2009m1helloworld.controller.admin.product;

import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.entity.myenum.ProductStatus;
import com.example.t2009m1helloworld.model.sql_modal.MySqlProductModel;

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
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String price = req.getParameter("price");
        String thumbnail = req.getParameter("thumbnail");
        String categoryId = req.getParameter("categoryId");
        String status = req.getParameter("status");
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(Double.parseDouble(price));
        product.setThumbnail(thumbnail);
        product.setCategoryId(Integer.parseInt(categoryId));
        product.setStatus(ProductStatus.getProductStatus(1));
        productModel.Save(product);
        resp.sendRedirect("/admin/product");
    }
}
