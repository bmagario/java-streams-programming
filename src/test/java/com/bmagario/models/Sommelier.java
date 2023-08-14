package com.bmagario.models;

import java.util.ArrayList;
import java.util.List;

public class Sommelier {

    private List<Wine> wines;

    public Sommelier() {
        wines = new ArrayList<>();
    }

    public void addWine(Wine wine) {
        wines.add(wine);
    }

    public Wine getWine(String name) {
        return wines.stream()
                .filter(wine -> wine.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Wine> getWines() {
        return wines;
    }

    public void recommendWine(String food) {
        wines.stream()
                .filter(wine -> wine.getFoodPairing().equals(food))
                .forEach(wine -> System.out.println(
                        "I recommend the " + wine.getName() + " wine with your " + food + " dish."));
    }
}