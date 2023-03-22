package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCart {
    Catalog catalog = new Catalog();

    @BeforeEach
    public void setupCatalog(){
        catalog.setPriceOf("Apples", 5.0);
        catalog.setPriceOf("Bananas", 3.0);
        catalog.setPriceOf("Oranges", 4.0);
    }

    @Test
    public void shouldBeEmptyWhenCreated(){
        Cart cart = new Cart(catalog);

        int numberOfItems = cart.getNumberOfItems();

        assertThat(numberOfItems).isEqualTo(0);

    }

    @Test
    public void shouldBeAbleToAddAnItem(){
        Cart cart = new Cart(catalog);

        cart.addToCart("Apples",2.0);

        int numberOfItems = cart.getNumberOfItems();

        assertThat(numberOfItems).isEqualTo(1);
    }

    @Test
    public void shouldKeepARunningTotal(){
        Cart cart = new Cart(catalog);

        cart.addToCart("Apples", 2.0);
        cart.addToCart("Bananas", 1.0);
        cart.addToCart("Oranges", 3.0);

        double runningTotal = cart.getRunningTotal();

        assertThat(runningTotal).isEqualTo(25.0);
    }

    @Test
    public void shouldApplyDiscountWhenBuying5KilosOrMore(){
        Catalog catalog = new Catalog();
        Cart cart = new Cart(catalog);

        cart.addToCart("Apples", 5.0);

        double runningTotal = cart.getRunningTotal();

        assertThat(runningTotal).isEqualTo(22.50);
    }

    @Test
    public void shouldApplyDiscountWhenBuying5KilosOrMoreWithDifferentProducts(){
        Cart cart = new Cart(catalog);

        cart.addToCart("Apples", 5.0);
        cart.addToCart("Bananas", 1.0);
        cart.addToCart("Oranges", 10.0);

        double runningTotal = cart.getRunningTotal();

        assertThat(runningTotal).isEqualTo(61.50);
    }


}
