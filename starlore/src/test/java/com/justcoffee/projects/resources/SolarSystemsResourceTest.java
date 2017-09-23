package com.justcoffee.projects.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class SolarSystemsResourceTest {

    // In memory jetty for testing purposes
    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new SolarSystemsResource())
            .build();

    @Test
    public void testGetSolarsystem() {
        ArrayList<String> systems = new ArrayList<>();
        systems.add("Sol");
        systems.add("Alpha Centauri");
        systems.add("Sirius");
        assertThat(resources.target("/solarsystems/list").request().get(ArrayList.class)).isEqualTo(systems);
    }
}