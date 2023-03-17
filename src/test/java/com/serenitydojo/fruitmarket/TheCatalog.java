package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
       Assertions.assertThat(catalog.getPriceOf("Apple")).isEqualTo(4.00);
    }

}
