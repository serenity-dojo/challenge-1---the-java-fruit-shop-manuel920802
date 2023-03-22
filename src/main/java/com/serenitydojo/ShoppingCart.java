package com.serenitydojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<CartItem> cartItemList = new ArrayList<>();
    private Double discount;
    private Map<String, Catalog> fruitCart;


    public ShoppingCart(Map<String, Catalog> fruitCart, Double discount ) {
        this.fruitCart = fruitCart;
        this.discount = discount;
    }



}
