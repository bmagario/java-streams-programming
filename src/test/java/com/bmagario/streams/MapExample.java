package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class MapExample {

    @Test
    void map() throws IOException {
        List<Wine> wines = JsonMockData.getWines();
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<String> wineNames = wines.stream()
                .map(Wine::getName)
                .collect(Collectors.toList());

        System.out.println("Wine names: " + wineNames);

        List<String> sommelierNames = sommeliers.stream()
                .map(Sommelier::getName)
                .collect(Collectors.toList());

        System.out.println("Sommelier names: " + sommelierNames);
    }
}
