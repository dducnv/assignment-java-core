package com.example.t2009m1helloworld.controller.client.CardController;

import com.example.t2009m1helloworld.entity.Cart;
import com.example.t2009m1helloworld.entity.Product;
import com.example.t2009m1helloworld.model.ProductModel;
import com.example.t2009m1helloworld.model.sql_modal.MySqlProductModel;
import com.example.t2009m1helloworld.util.ShoppingCartHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddToCartController extends HttpServlet {
    private ProductModel productModel;

    public AddToCartController() {
        this.productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer productId = Integer.parseInt(req.getParameter("productId"));
            Integer quantity = Integer.parseInt(req.getParameter("quantity"));
            Product product = productModel.findById(productId);
            if (product == null) {
                resp.getWriter().println("Product is not found!");
                return;
            }
            if (quantity <= 0) {
                resp.getWriter().println("Invalid quantity!");
                return;
            }
            ShoppingCartHelper shoppingCartHelper = new ShoppingCartHelper(req);
            Cart cart = shoppingCartHelper.getCart();
            cart.add(product, quantity);
            shoppingCartHelper.saveCart(cart);
            resp.sendRedirect("/cart");
        } catch (Exception ex) {
            resp.getWriter().println(ex.getMessage());
        }
    }
}
