package com.justcoffee.projects.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/solarsystems")
@Produces(MediaType.TEXT_PLAIN)
public class SolarSystemsResource {

    @Path("/list")
    @GET
    public String getSolarsystemsList() {
        return "Help";
    }
}
