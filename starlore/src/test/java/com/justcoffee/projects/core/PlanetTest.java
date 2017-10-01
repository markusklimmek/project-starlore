package com.justcoffee.projects.core;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
    public void aPlanetIsClassified() {
        Planet planet = new Planet("Earth");
        assertThat(planet.getPlanetClassification(), is(instanceOf(PlanetClassification.class)));
    }

    @Test
    public void weCanSetThePlanetsClassificationAtCreation() {
        Planet planet = new Planet("Mars", PlanetClassification.GASGIANT);
        assertEquals(PlanetClassification.GASGIANT, planet.getPlanetClassification());
    }
}