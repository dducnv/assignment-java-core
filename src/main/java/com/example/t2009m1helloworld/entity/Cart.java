package com.example.t2009m1helloworld.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart {
    private double totalPrice;
    private String shipName;
    private String shipAddress;
    private String shipPhone;
    private String shipNote;
    private HashMap<Integer,CartItem> items;

    public List<CartItem> getListItem(){
        return new ArrayList<>();
    }
    public boolean add(Product product,int quatity){
        CartItem cartItem = null;
        if (items.containsKey(product.getId())){
            cartItem = items.get(product.getId());
            cartItem.setQuantity(cartItem.getQuantity()+quatity);
        }else{
            cartItem = CartItem.CartItemBuilder.aCartItem()
                        .productId(product.getId())
                        .productName(product.getName())
                        .productThumbnail(product.getThumbnail())
                        .unitPrice(product.getPrice())
                        .quantity(quatity)
                        .build();
        }
        items.put(product.getId(),cartItem);
        return true;
    }

    public boolean sub(Product product,int quantity){
        CartItem cartItem = null;
        if (items.containsKey(product.getId())){
            cartItem = items.get(product.getId());
            int updateQuantity = cartItem.getQuantity() - quantity;
            if (updateQuantity <= 0){
                items.remove(product.getId());
            }else {
                cartItem.setQuantity(updateQuantity);// update số lượng theo số lượng mới
            }
        }
        return true;
    }
    public boolean remove(int productId){
        if(items.containsKey(productId)){
            items.remove(productId);
        }
        return true;
    }

    public void Clear(){
        items.clear();
    }


    public Cart() {
        items = new HashMap<>();
    }


    public double getTotalPrice() {
        if (items.size()==0){
            return 0;
        }
        totalPrice = 0;
        for (CartItem item:
                getListItem()){
            totalPrice += item.getUnitPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    public String getShipNote() {
        return shipNote;
    }

    public void setShipNote(String shipNote) {
        this.shipNote = shipNote;
    }

    public HashMap<Integer, CartItem> getItems() {
        return items;
    }

    public void setItems(HashMap<Integer, CartItem> items) {
        this.items = items;
    }
}
