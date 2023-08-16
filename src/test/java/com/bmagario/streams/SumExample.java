package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SumExample {

    @Test
    void sum() throws IOException {
        List<Wine> wines = JsonMockData.getWines();

        double totalPriceOfWines = wines.stream()
                .mapToDouble(Wine::getPrice)
                .sum();

        System.out.println("The total price of all the wines is: " + totalPriceOfWines);
    }
}
