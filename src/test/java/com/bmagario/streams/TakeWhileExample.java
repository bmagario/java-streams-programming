package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;

public class TakeWhileExample {

    @Test
    void takeWhile() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        List<Wine> wines = JsonMockData.getWines();
        Sommelier.addWines(sommeliers, wines);

        sommeliers.stream().takeWhile(sommelier -> Objects.nonNull(sommelier.getWines()))
                .map(Sommelier::getName)
                .forEach(System.out::println);
    }
}
