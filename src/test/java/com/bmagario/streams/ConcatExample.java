package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class ConcatExample {

    @Test
    void concat() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        List<Wine> wines = JsonMockData.getWines();

        Stream<Sommelier> sommelierStream = sommeliers.stream();
        Stream<Wine> wineStream = wines.stream();

        Stream<Object> concatenatedStream = Stream.concat(sommelierStream, wineStream);

        concatenatedStream.forEach(System.out::println);
    }
}
