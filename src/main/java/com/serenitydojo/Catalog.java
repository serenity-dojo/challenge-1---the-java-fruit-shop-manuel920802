package com.serenitydojo;

import java.util.Map;

public class Catalog {
    Map<String, Integer> fruitCatalog;

    public Catalog(Map<String,Integer> fruitCatalog){
        this.fruitCatalog = fruitCatalog;
    }

    public String setPriceOf(String Apple){
        return fruitCatalog.toString();
    }

    public double getPriceOf(){
        return 0;
    }



}
