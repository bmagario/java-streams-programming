package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsAveragingLongExample {

    @Test
    void collectorsAveragingLong() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        double averageAge =
                sommeliers.stream()
                        .collect(Collectors.averagingLong(Sommelier::getAge));

        System.out.println(averageAge);
    }
}
