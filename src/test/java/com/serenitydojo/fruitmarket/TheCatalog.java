package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TheCatalog {

    HashMap<String, Double> fruitCatalog = new HashMap<>();


    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {

        Catalog catalog = new Catalog(fruitCatalog);
       catalog.setPriceOf("Apple", 4.00);
       Assertions.assertThat(catalog.getPriceOf("Apple")).isEqualTo(4.00);
    }

}
