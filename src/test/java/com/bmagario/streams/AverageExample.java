package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;
import org.junit.jupiter.api.Test;

public class AverageExample {

    @Test
    void average() throws IOException {
        List<Wine> wines = JsonMockData.getWines();

        OptionalDouble averagePriceOfWines = wines.stream()
                .mapToDouble(Wine::getPrice)
                .average();

        System.out.println("The average price of all the wines is: " + averagePriceOfWines.getAsDouble());
    }
}
