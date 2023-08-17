package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class FlatMapExample {

    @Test
    void flatMap() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        List<Wine> wines = JsonMockData.getWines();
        Sommelier.addWines(sommeliers, wines);

        Stream<Sommelier> sommelierStream = sommeliers.stream();
        Stream<Wine> winesStream = sommelierStream.filter(sommelier -> sommelier.getWines() != null)
                .flatMap(sommelier -> sommelier.getWines().stream());

        winesStream.forEach(System.out::println);
    }
}
