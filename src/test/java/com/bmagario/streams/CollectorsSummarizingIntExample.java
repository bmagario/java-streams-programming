package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsSummarizingIntExample {

    @Test
    void collectorsSummarizingInt() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        IntSummaryStatistics summary = sommeliers.stream().collect(
                Collectors.summarizingInt(Sommelier::getAge));

        System.out.println(summary);
    }
}
