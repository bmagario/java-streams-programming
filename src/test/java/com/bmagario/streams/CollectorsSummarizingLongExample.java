package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class CollectorsSummarizingLongExample {

    @Test
    void collectorsSummarizingLong() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        LongSummaryStatistics summary = sommeliers.stream()
                .collect(Collectors.summarizingLong(Sommelier::getAge));

        System.out.println(summary);
    }
}