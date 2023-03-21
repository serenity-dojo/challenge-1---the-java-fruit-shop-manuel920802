package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.*;

public class TheCatalog {

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
       //You can update the catalog with the current market price of a fruit

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
       catalog.setPriceOf("Apples", 4.00);
       //THEN
        double applePrice = catalog.getPriceOf("Apples");
       assertThat(applePrice).isEqualTo(4.00);
    }

    @Test
    public void shouldListNamesOfAvailableFruitInAlphabeticalOrder(){
        //The Catalog should list the names of the currently available fruit in alphabetical order

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);
        //THEN
        assertThat(catalog.getFruitList()).containsExactly("Apples","Bananas","Oranges","Pears");
    }

   @Test
    public void shouldValidateThePriceOfAFruit(){
        //The Catalog should report the price of a given type of fruit

       //GIVEN
       Catalog catalog = new Catalog();
       //WHEN
       catalog.setPriceOf("Apples",4.00);
       double applePrice = catalog.getPriceOf("Apples");
       //THEN
       assertThat(applePrice).isEqualTo(4.00);
    }

    @Test (expected = FruitUnavailableException.class)
    public void shouldThrowCustomExceptionWhenFruitIsNotAvailable() {
        //The Catalog should throw a FruitUnavailableException if the fruit is not currently available

        //GIVEN
        Catalog catalog = new Catalog();

        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);

        catalog.getPriceOf("Kiwis");

        //THEN


    }





}
