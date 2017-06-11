package com.justcoffee.projects;

import com.justcoffee.projects.resources.HelloWorldResource;
import com.justcoffee.projects.resources.IndexResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class StarloreApplication extends Application<StarloreConfiguration> {

    public static void main(final String[] args) throws Exception {
        new StarloreApplication().run(args);
    }

    @Override
    public String getName() {
        return "Starlore";
    }

    @Override
    public void initialize(final Bootstrap<StarloreConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<StarloreConfiguration>());
    }

    @Override
    public void run(final StarloreConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
        final IndexResource indexResource = new IndexResource();
        environment.jersey().register(indexResource);

    }

}
