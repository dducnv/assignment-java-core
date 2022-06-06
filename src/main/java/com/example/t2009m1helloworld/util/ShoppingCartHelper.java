package com.example.t2009m1helloworld.util;
import com.example.t2009m1helloworld.entity.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
public class ShoppingCartHelper {
    private static final String CART_SESSTIOM_NAME = "CART";
    HttpSession session;

    public ShoppingCartHelper(HttpServletRequest request){this.session = request.getSession();}

    public Cart getCart(){
        Cart shoppingcart = (Cart) session.getAttribute(CART_SESSTIOM_NAME);
        if (shoppingcart == null){
            shoppingcart = new Cart();
        }
        return shoppingcart;
    }
    public void saveCart(Cart cart){
        session.setAttribute(CART_SESSTIOM_NAME,cart);
    }
}
