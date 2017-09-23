package com.justcoffee.projects.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/solarsystems")
@Produces(MediaType.APPLICATION_JSON)
public class SolarSystemsResource {

    // ToDo: Should be map and not a list, because it is not sorted.
    @Path("/list")
    @GET
    public List<String> getSolarsystemsList() {
        return Arrays.asList("Sol", "Alpha Centauri", "Sirius");
    }
}
