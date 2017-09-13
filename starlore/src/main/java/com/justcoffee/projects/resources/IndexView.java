package com.justcoffee.projects.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.views.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexView extends View {

    @JsonProperty
    private String name;

    private Logger logger;

    public IndexView(String name) {
        super("index.ftl");
        this.name = name;
        logger = LoggerFactory.getLogger("com.justcoffee.projects.resources.IndexView");
        logger.debug(name);
    }

    public String getName() {
        logger.debug("getName");
        return name;
    }

}
