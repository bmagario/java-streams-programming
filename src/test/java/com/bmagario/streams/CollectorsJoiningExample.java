package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsJoiningExample {

    @Test
    void collectorsJoining() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        String names = sommeliers.stream().map(Sommelier::getName)
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}
