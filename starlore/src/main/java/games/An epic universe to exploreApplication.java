package games;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class An epic universe to exploreApplication extends Application<An epic universe to exploreConfiguration> {

    public static void main(final String[] args) throws Exception {
        new An epic universe to exploreApplication().run(args);
    }

    @Override
    public String getName() {
        return "An epic universe to explore";
    }

    @Override
    public void initialize(final Bootstrap<An epic universe to exploreConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final An epic universe to exploreConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
