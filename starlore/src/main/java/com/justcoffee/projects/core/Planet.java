package com.justcoffee.projects.core;

public class Planet {

    private final String name;

    public Planet(String planetName) {
        this.name = planetName;
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("A Planet must have a name");
        }

    }

    public String getName() {
        return name;
    }
}
