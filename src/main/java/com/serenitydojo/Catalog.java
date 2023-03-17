package com.serenitydojo;

import java.util.Map;

public class Catalog {
    Map<String, Double> fruitCatalog;

    public Catalog(Map<String,Double> fruitCatalog){
        this.fruitCatalog = fruitCatalog;
    }

    public void setPriceOf(String fruit, Double price){
        if (fruitCatalog.containsKey(fruit)){
            fruitCatalog.replace(fruit,price);
        }
    }

    public Double getPriceOf(String fruit) {
        return fruitCatalog.get(fruit);
    }



}
