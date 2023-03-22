package com.serenitydojo;

public class ShoppingCart {
    private String product;
    private int quantity;


    public ShoppingCart(String product, int quantity, double kilograms) {
        this.product = product;
        this.quantity = quantity;
    }
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
