package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindFirstExample {

    @Test
    void findFirst() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Sommelier firstSommelierSpecializingInRedWines = sommeliers.stream()
                .filter(sommelier -> sommelier.getExpertise().equals("Red wines"))
                .findFirst()
                .get();

        System.out.println("The first sommelier who specializes in red wines is: "
                + firstSommelierSpecializingInRedWines.getName());
    }
}
