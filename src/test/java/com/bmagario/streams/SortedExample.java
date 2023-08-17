package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class SortedExample {

    @Test
    void sorted() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<Sommelier> sortedSommeliers = sommeliers.stream()
                .sorted(Comparator.comparing(Sommelier::getName))
                .collect(Collectors.toList());

        System.out.println("The sorted sommeliers are: ");
        sortedSommeliers.forEach(sommelier -> System.out.println(sommelier.getName()));
    }
}
