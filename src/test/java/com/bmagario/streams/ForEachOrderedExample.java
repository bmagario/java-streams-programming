package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ForEachOrderedExample {

    @Test
    void forEachOrdered() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        sommeliers.stream().forEachOrdered(sommelier -> {
            System.out.println(sommelier.getName());
        });
    }
}
