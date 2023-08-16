package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class MinExample {

    @Test
    void min() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Optional<Sommelier> sommelierWithShortestName = sommeliers.stream()
                .min(Comparator.comparingInt(sommelier -> sommelier.getName().length()));


        System.out.println("The sommelier with the shortest name is: "
                + sommelierWithShortestName.get().getName());
    }
}
