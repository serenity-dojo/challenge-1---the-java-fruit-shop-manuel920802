package com.serenitydojo.fruitmarket;

import com.serenitydojo.Catalog;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class TheCatalog {

    Map<String, Integer> fruitCatalog = Map.of("Apple", 1,"Orange",2,"Banana",3,"Pear",4);

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
// TODO: Uncomment this code and make it work
        Catalog catalog = new Catalog(fruitCatalog);
       catalog.setPriceOf(Apple).to(4.00);
       assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);

    }
}
