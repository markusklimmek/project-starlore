package com.justcoffee.projects.core;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolarSystemTest {

    @Test
    public void testForNameSetting() {
        SolarSystem solarSystem = new SolarSystem("Sol");
        assertEquals("Sol", solarSystem.getName());
    }
    //TODO: Is the created url right? No blanks in there, is there the right prefix
}