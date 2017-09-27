package com.justcoffee.projects.core;

public class Planet {

    private final String name;
    private final PlanetClassification classification;

    public Planet(String planetName) {
        this(planetName, PlanetClassification.getRandomClassification());

    }

    public Planet(String planetName, PlanetClassification classification) {
        this.name = planetName;
        this.classification = classification;
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("A Planet must have a name");
        }
    }

    public String getName() {
        return name;
    }

    public PlanetClassification getPlanetClassification() {
        return classification;
    }
}
