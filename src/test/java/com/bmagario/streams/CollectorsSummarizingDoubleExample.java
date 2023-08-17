package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsSummarizingDoubleExample {

    @Test
    void collectorsSummarizingDouble() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        DoubleSummaryStatistics summary = sommeliers.stream().collect(
                Collectors.summarizingDouble(Sommelier::getAge));

        System.out.println(summary);
    }
}