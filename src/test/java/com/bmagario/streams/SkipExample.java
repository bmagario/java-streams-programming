package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class SkipExample {

    @Test
    void skip() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        List<Sommelier> skipSommeliers = sommeliers.stream()
                .skip(3)
                .collect(Collectors.toList());

        skipSommeliers.forEach(sommelier -> System.out.println(sommelier.getName()));
    }
}
