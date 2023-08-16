package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CollectExample {

    @Test
    void collect() throws IOException {
        List<String> wines = JsonMockData.getWines()
                .stream()
                .map(Wine::getName)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );
        wines.forEach(System.out::println);
    }
}
