package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsGroupingByExample {

    @Test
    void collectorsGroupingBy() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Map<String, List<Sommelier>> sommeliersByCountry = sommeliers.stream().collect(
                Collectors.groupingBy(Sommelier::getCountry));

        System.out.println(sommeliersByCountry);
    }
}
