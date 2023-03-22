package com.serenitydojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    private final Map<String, Double> fruitCatalog = new HashMap<>();

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

    public void deletePriceOf(String fruit, Double price){
        fruitCatalog.remove(fruit,price);
    }

   public void updatePriceOf(String fruit, Double oldPrice, Double newPrice){
       fruitCatalog.replace(fruit,oldPrice,newPrice);
    }

    public void searchForFruits(String fruit){
        if(fruitCatalog.containsKey(fruit)){
            System.out.println("The fruit Catalog contains: " + fruit);
        } else {
            System.out.println("The fruit Catalog does not contains: " + fruit);
        }
    }
    public void printFruitMap(){
        for (Map.Entry<String, Double> entry: fruitCatalog.entrySet() ){
            System.out.println("Fruit:" + entry.getKey() + " -> " + "Cost per unit:" + entry.getValue());
        }
    }




}
