package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AnyMatchExample {

    @Test
    void anyMatch() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        boolean hasRedWineExpertise = sommeliers.stream()
                .anyMatch(sommelier -> sommelier.getExpertise().equals("Red wines"));

        System.out.println("Does any sommelier specialize in red wines? " + hasRedWineExpertise);
    }
}
