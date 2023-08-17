package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsToListExample {

    @Test
    void collectorsToList() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<String> names = sommeliers.stream().map(Sommelier::getName).collect(
                Collectors.toList());

        System.out.println(names);
    }
}