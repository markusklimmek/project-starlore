package com.justcoffee.projects;

import com.justcoffee.projects.resources.HelloWorldResource;
import com.justcoffee.projects.resources.IndexResource;
import com.justcoffee.projects.resources.SolarSystemsResource;
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
        final HelloWorldResource helloWorldResource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        final IndexResource indexResource = new IndexResource();
        final SolarSystemsResource solarSystemsResource = new SolarSystemsResource();
        environment.jersey().register(helloWorldResource);
        environment.jersey().register(indexResource);
        environment.jersey().register(solarSystemsResource);
    }

}
