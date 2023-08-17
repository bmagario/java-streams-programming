package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ReduceExample {

    @Test
    void reduce() throws IOException {
        List<Wine> wines = JsonMockData.getWines();
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        // Find the most expensive wine
        Double mostExpensiveWinePrice = wines.stream()
                .mapToDouble(Wine::getPrice)
                .reduce(Double.MIN_VALUE, (accumulator, price) -> Double.max(accumulator, price));

        System.out.println("Most expensive wine price: " + mostExpensiveWinePrice);

        // Find the sommelier with the longest name
        String longestSommelierName = sommeliers.stream()
                .map(Sommelier::getName)
                .reduce("", (accumulator, name) -> accumulator.length() >= name.length() ? accumulator : name);

        System.out.println("Longest sommelier name: " + longestSommelierName);
    }
}
