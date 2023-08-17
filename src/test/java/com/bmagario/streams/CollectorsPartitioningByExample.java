package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsPartitioningByExample {

    @Test
    void collectorsPartitioningBy() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Map<Boolean, List<Sommelier>> sommeliersByAward = sommeliers.stream().collect(
                Collectors.partitioningBy(Sommelier::hasWonAward));

        System.out.println(sommeliersByAward);
    }
}
