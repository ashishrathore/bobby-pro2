package application;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import resource.RandomUUID;

public class MyUUIDApp extends Application<Config> {


    public static void main(String[] args) throws Exception {
        new MyUUIDApp().run(args);
    }

    @Override
    public void run(final Config configuration,
                    final Environment environment) {

        environment.jersey().register(new RandomUUID());


    }
}
