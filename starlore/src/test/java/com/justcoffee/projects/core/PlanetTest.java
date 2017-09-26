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
}