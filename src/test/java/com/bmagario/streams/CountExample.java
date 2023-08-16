package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CountExample {

    @Test
    void count() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        int numberOfSommeliersSpecializingInRedWines = (int) sommeliers.stream()
                .filter(sommelier -> sommelier.getExpertise().equals("Red wines"))
                .count();

        System.out.println("The number of sommeliers who specialize in red wines is: "
                + numberOfSommeliersSpecializingInRedWines);
    }
}
