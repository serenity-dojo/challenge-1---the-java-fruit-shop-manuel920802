package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class TheCatalog {

    Map<String, Double> fruitCatalog = Map.of("Apple", 1.00,"Orange",1.00,"Banana",1.00,"Pear",1.00);

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {

        Catalog catalog = new Catalog(fruitCatalog);
       catalog.setPriceOf("Apple", 4.00);
       assertThat(catalog.getPriceOf("Apple")).isEqualTo(4.00);

    }
}
