package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AllMatchExample {

    @Test
    void allMatch() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        boolean allSommeliersSpecializeInRedWines = sommeliers.stream()
                .allMatch(sommelier -> sommelier.getExpertise().equals("Red wines"));

        System.out.println("Do all sommeliers specialize in red wines? "
                + allSommeliersSpecializeInRedWines);
    }
}
