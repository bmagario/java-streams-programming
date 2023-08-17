package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class IterateExample {

    @Test
    void iterate() throws IOException {
        List<Wine> wines = JsonMockData.getWines();

        Stream<Wine> wineStream = Stream.iterate(wines.get(0), wine -> wines.get(0))
                .limit(10)
                .filter(wine -> wine.getPrice() >= 60);

        wineStream.forEach(System.out::println);
    }
}
