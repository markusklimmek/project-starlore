package com.justcoffee.projects;

import com.justcoffee.projects.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
        // TODO: application initialization
    }

    @Override
    public void run(final StarloreConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);

    }

}
