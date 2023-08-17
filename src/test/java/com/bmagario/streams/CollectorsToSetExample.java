package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsToSetExample {

    @Test
    void collectorsToSet() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Set<String> names = sommeliers.stream().map(Sommelier::getName).collect(
                Collectors.toSet());

        System.out.println(names);
    }
}
