package com.justcoffee.projects.core;

public enum PlanetClassification {
    EARTHLIKE,
    MARTIAN;

    private static PlanetClassification classification;

    public static PlanetClassification getRandomClassification() {
        return EARTHLIKE;
    }
}
