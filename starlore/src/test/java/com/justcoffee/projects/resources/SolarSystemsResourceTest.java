package com.justcoffee.projects.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolarSystemsResourceTest {

    // In memory jetty for testing purposes
    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new SolarSystemsResource())
            .build();

    @Test
    public void testGetSolarsystem() {
        assertThat(resources.target("/solarsystems/list").request().get(String.class)).isEqualTo("Help");
    }
}