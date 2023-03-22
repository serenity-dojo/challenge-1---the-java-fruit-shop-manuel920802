package com.serenitydojo.fruitmarket;

import com.serenitydojo.CartItem;
import com.serenitydojo.Catalog;
import com.serenitydojo.FruitUnavailableException;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class TheCatalog {

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
       //You can update the catalog with the current market price of a fruit

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
       catalog.setPriceOf("Apples", 4.00);
        double applePrice = catalog.getPriceOf("Apples");
       //THEN
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
        assertThat(catalog.getPriceOf("Kiwis")).isNull();
    }

    @Test
    public void shouldBeAbleToDeleteTheCurrentPriceOfAFruit(){
        // You can delete a fruit name and price from the fruit catalog

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);

        catalog.deletePriceOf("Pears",2.00);
        //THEN
        assertThat(catalog.getFruitList()).doesNotContain("Pears");
    }

    @Test
    public void shouldBeAbleToUpdateFromOldToNewPriceOfAFruit(){
        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);

        catalog.updatePriceOf("Pears",2.00, 3.00);
        //THEN
        assertThat(catalog.getPriceOf("Pears")).isEqualTo(3.00);
    }

    @Test
    public void shouldBeAbleToSearchForFruitNamesBeingIncluded(){
        //When user searches for a specific fruit within fruit catalog

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);

        catalog.searchForFruits("Apples");
        //THEN
        assertThat(catalog.getFruitList()).contains("Apples");
    }

    @Test
    public void shouldBeAbleToPrintFruitMap(){
        //When user wants to know all items  and prices included in fruit catalog

        //GIVEN
        Catalog catalog = new Catalog();
        //WHEN
        catalog.setPriceOf("Apples",4.00);
        catalog.setPriceOf("Oranges",3.50);
        catalog.setPriceOf("Bananas",2.50);
        catalog.setPriceOf("Pears",2.00);

        //THEN
        catalog.printFruitMap();
    }

    @Test
    public void shouldBeAbleToAddFruitsToShoppingCart(){
        //You can add items to your shopping cart, which should keep a running total.
        //GIVEN

        //WHEN

        //THEN
        //assertThat()
    }

    @Test
    public void shouldBeAbleToBuy5KilosOrMoreToGetDiscount(){
        //When you buy 5 kilos or more of any fruit, you get a 10% discount.

        //GIVEN

        //WHEN

        //THEN
        //assertThat()
    }







}
