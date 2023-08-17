package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class FilterExample {

    @Test
    void filter() throws IOException {
        List<Wine> wines = JsonMockData.getWines();
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<Wine> redWines = wines.stream()
                .filter(wine -> wine.getGrapeVariety().equals("Cabernet Sauvignon"))
                .collect(Collectors.toList());

        System.out.println("Red wines: " + redWines);

        List<String> redWineSommeliers = sommeliers.stream()
                .filter(sommelier -> sommelier.getExpertise().equals("Red wines"))
                .map(Sommelier::getName)
                .collect(Collectors.toList());

        System.out.println("Red wine sommeliers: " + redWineSommeliers);
    }
}
