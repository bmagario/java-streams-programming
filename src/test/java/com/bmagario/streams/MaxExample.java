package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class MaxExample {

    @Test
    void max() throws IOException {
        List<Wine> wines = JsonMockData.getWines();

        Optional<Wine> mostExpensiveWine = wines.stream()
                .max(Comparator.comparingDouble(wine -> wine.getPrice()));

        System.out.println("The most expensive wine is: " + mostExpensiveWine.get().getName());
    }
}
