package com.serenitydojo;

public class CartItem {
    private Catalog fruit;
    private int quantity;
    private Double weight;


    public CartItem(Catalog fruit, int quantity) {
        super();
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public CartItem(Catalog fruit){
        this(fruit, 1);
    }

    public CartItem(Catalog fruit, Double weight){
        this(fruit);
        this.weight = weight;
    }

    public Catalog getFruit(){
        return fruit;
    }

    public Integer addOneItem(){
        return quantity = quantity + 1;
    }

    public Integer removeOneItem(){
        return  quantity = quantity -1;
    }

    public Integer getQuantity(){
        return quantity;
    }
}
