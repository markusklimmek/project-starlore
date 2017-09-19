package com.justcoffee.projects.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class IndexResource {

    private Logger logger = LoggerFactory.getLogger("com.justcoffee.projects.resources.IndexResource");

    @GET
    public IndexView getIndex() {
        logger.debug("I am here");
        return new IndexView("Markus Klimmek");
    }
}
