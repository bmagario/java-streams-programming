package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NoneMatchExample {

    @Test
    void noneMatch() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        boolean noneSommeliersSpecializeInRedWines = sommeliers.stream()
                .noneMatch(sommelier -> sommelier.getExpertise().equals("Marcian wines"));

        System.out.println("Are there no sommeliers who specialize in red wines? "
                + noneSommeliersSpecializeInRedWines);
    }
}
