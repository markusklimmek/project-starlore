package com.justcoffee.projects.resources;

import io.dropwizard.views.View;

class IndexView extends View {
    String name;

    IndexView(String name) {
        super("index.ftl");
    }

    String getName() {
        return name;
    }

}
