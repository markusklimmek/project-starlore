package com.justcoffee.projects.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    @Test
    public void aPlanetNeedsAName() {
        Planet planet = new Planet("Earth");
        assertEquals("Earth", planet.getName());
     }
    @Test(expected = IllegalArgumentException.class)
    public void aPlanetNameShouldNotBeEmpty() {
        Planet planet = new Planet(" ");
     }

    @Test
    public void aPlanetIsInAClass() {
        Planet planet = new Planet("Earth");
        //TODO: A value must be set, not important which one
        assertEquals(PlanetClassification.EARTHLIKE, planet.getPlanetClassification());
    }

    @Test
    public void weCanSetThePlanetsClassAtCreation() {
        Planet planet = new Planet("Mars", PlanetClassification.MARTIAN);
        assertEquals(PlanetClassification.MARTIAN, planet.getPlanetClassification());
    }
}