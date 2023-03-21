package com.serenitydojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    private Map<String, Double> fruitCatalog = new HashMap<>();

    public void setPriceOf(String fruit, Double price){
        fruitCatalog.put(fruit,price);
    }

    public Double getPriceOf(String fruit) {
        if(!fruitCatalog.containsKey(fruit)){
            throw new FruitUnavailableException("No fruit available for: " + fruit);
        }
        return fruitCatalog.get(fruit);
    }

    public List<String> getFruitList(){
        return fruitCatalog.keySet().stream().sorted().toList();
    }





}
