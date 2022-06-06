package com.example.t2009m1helloworld.entity;

public class CartItem {
    private int productId;
    private String productName; // tránh truy vấn nhiều vào db
    private String productThumbnail;
    private  double unitPrice;
    private int quantity;

    public CartItem() {
    }

    public CartItem(int productId, String productName, String productThumbnail, double unitPrice, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productThumbnail = productThumbnail;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static final class CartItemBuilder {
        private int productId;
        private String productName; // tránh truy vấn nhiều vào db
        private String productThumbnail;
        private  double unitPrice;
        private int quantity;

        private CartItemBuilder() {
        }

        public static CartItemBuilder aCartItem() {
            return new CartItemBuilder();
        }

        public CartItemBuilder productId(int productId) {
            this.productId = productId;
            return this;
        }

        public CartItemBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public CartItemBuilder productThumbnail(String productThumbnail) {
            this.productThumbnail = productThumbnail;
            return this;
        }

        public CartItemBuilder unitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public CartItemBuilder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public CartItem build() {
            CartItem cartItem = new CartItem();
            cartItem.setProductId(productId);
            cartItem.setProductName(productName);
            cartItem.setProductThumbnail(productThumbnail);
            cartItem.setUnitPrice(unitPrice);
            cartItem.setQuantity(quantity);
            return cartItem;
        }
    }
}
