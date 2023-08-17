package com.bmagario.streams;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindAnyExample {

    @Test
    void findAny() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();

        Sommelier anySommelierSpecializingInRedWines = sommeliers.stream()
                .filter(sommelier -> sommelier.getExpertise().equals("Red wines"))
                .findAny()
                .get();

        System.out.println("A sommelier who specializes in red wines is: "
                + anySommelierSpecializingInRedWines.getName());
    }
}
