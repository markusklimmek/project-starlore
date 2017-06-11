package com.justcoffee.projects.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_XHTML_XML)
public class IndexResource {

    @GET
    @Timed
    public IndexView printIndex() {
        return new IndexView("Markus Klimmek");
    }
}
