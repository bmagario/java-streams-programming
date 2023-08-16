package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ForEachExample {

    @Test
    void forEach() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        sommeliers.forEach(sommelier -> System.out.println(sommelier.getName()));
    }
}
