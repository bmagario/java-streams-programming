package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsAveragingIntExample {

    @Test
    void collectorsAveragingInt() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        double averageAge =
                sommeliers.stream()
                        .collect(Collectors.averagingInt(Sommelier::getAge));

        System.out.println(averageAge);
    }
}