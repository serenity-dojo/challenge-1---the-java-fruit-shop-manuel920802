package com.serenitydojo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final Catalog catalog;

    List<CartItem> items = new ArrayList<>();

    public Cart(Catalog catalog) {
        this.catalog = catalog;
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public void addToCart(String fruit, double quantity) {
        //Add the product to the cart
        items.add(new CartItem(fruit, quantity));
    }

    public double getRunningTotal() {
        return items.stream()
                .mapToDouble(item -> priceOf(item))
                .sum();
    }

    private double priceOf(CartItem item){
        if(item.quantity() >= 5.0){
            return catalog.getPriceOf(item.fruit()) * item.quantity() * 0.9;
        }else{
            return catalog.getPriceOf(item.fruit()) * item.quantity();
        }
    }
}

