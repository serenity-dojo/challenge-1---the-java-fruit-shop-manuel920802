package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {

    Map<String, Double> fruitCatalog;
    {
        fruitCatalog = new HashMap<>();
        fruitCatalog.put("Apple",1.00);
        fruitCatalog.put("Orange",1.00);
        fruitCatalog.put("Banana",1.00);
        fruitCatalog.put("Pear",1.00);
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        //GIVEN
        Catalog catalog = new Catalog(fruitCatalog);
        //WHEN
       catalog.setPriceOf("Apple", 4.00);
       //THEN
       assertThat(catalog.getPriceOf("Apple")).isEqualTo(4.00);
    }

    @Test
    public void shouldListNamesOfAvailableFruitInAlphabeticalOrder(){
        //GIVEN
        Catalog catalog = new Catalog(fruitCatalog);
        Map<String,Double> sortedFruits = new TreeMap<>(fruitCatalog);
        //WHEN
        catalog.getFruitList(sortedFruits);
        //THEN
        Assertions.assertThat(sortedFruits).containsOnlyKeys("Apple","Banana","Orange","Pear");




    }

}
