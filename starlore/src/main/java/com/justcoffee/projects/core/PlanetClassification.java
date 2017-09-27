package com.justcoffee.projects.core;
// TODO: We need a clever classification system, there is perhaps one in astronomy or we take one from Star Trek
public enum PlanetClassification {
    EARTHLIKE,
    MARTIAN;

    private static PlanetClassification classification;
    //TODO: it should be truly random :)
    //TODO: how to test for wanted randomness???
    public static PlanetClassification getRandomClassification() {
        return MARTIAN;
    }
}
