package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class PeekExample {

    @Test
    void peek() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        List<Wine> wines = JsonMockData.getWines();

        Random random = new Random();
        sommeliers.stream().peek(sommelier -> {
                    System.out.println("Adding a wine to " + sommelier.getName());
                })
                .forEach(sommelier -> {
                    int randomIndex = random.nextInt(wines.size());
                    sommelier.addWine(wines.get(randomIndex));
                });

        System.out.println(sommeliers);
    }
}
