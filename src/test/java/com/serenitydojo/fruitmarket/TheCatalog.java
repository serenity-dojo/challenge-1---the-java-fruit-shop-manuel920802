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
       //You can update the catalog with the current market price of a fruit

        //GIVEN
        Catalog catalog = new Catalog(fruitCatalog);
        //WHEN
       catalog.setPriceOf("Apple", 4.00);
       //THEN
       assertThat(catalog.getPriceOf("Apple")).isEqualTo(4.00);
    }

    @Test
    public void shouldListNamesOfAvailableFruitInAlphabeticalOrder(){
        //The Catalog should list the names of the currently available fruit in alphabetical order

        //GIVEN
        Catalog catalog = new Catalog(fruitCatalog);
        Map<String,Double> sortedFruits = new TreeMap<>(fruitCatalog);
        //WHEN
        catalog.getFruitList(sortedFruits);
        //THEN
        assertThat(sortedFruits).containsOnlyKeys("Apple","Banana","Orange","Pear");
    }

   @Test
    public void shouldValidateThePriceOfAFruit(){
        //The Catalog should report the price of a given type of fruit

       //GIVEN
       Catalog catalog = new Catalog(fruitCatalog);
       //WHEN
       catalog.getPriceOf("Apple");
       //THEN
       assertThat(catalog.getPriceOf("Apple")).isEqualTo(1.00);
    }

    @Test
    public void shouldThrowCustomExceptionWhenFruitIsNotAvailable(){
        //The Catalog should throw a FruitUnavailableException if the fruit is not currently available

        //GIVEN
        Catalog catalog = new Catalog(fruitCatalog);
        //WHEN

        //THEN

    }





}
