package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class DistinctExample {

    @Test
    void distinct() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<String> distinctSommelierNames = sommeliers.stream()
                .map(Sommelier::getName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The distinct names of all the sommeliers are: ");
        distinctSommelierNames.forEach(System.out::println);
    }
}
