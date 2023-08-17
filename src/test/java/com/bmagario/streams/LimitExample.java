package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class LimitExample {

    @Test
    void limit() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<Sommelier> limitedSommeliers = sommeliers.stream()
                .limit(3)
                .collect(Collectors.toList());

        limitedSommeliers.forEach(System.out::println);
    }
}
