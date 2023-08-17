package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsToMapExample {

    @Test
    void collectorsToMap() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Map<String, Sommelier> sommeliersByName = sommeliers.stream().collect(
                Collectors.toMap(Sommelier::getName, sommelier -> sommelier));

        System.out.println(sommeliersByName);
    }
}
