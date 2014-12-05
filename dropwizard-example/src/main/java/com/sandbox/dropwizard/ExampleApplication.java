package com.sandbox.dropwizard.example;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.sandbox.dropwizard.example.configuration.ExampleConfiguration;

public class ExampleApplication extends Application<ExampleConfiguration>  {
  
    
    private final MigrationsBundle<ExampleConfiguration> migrationsBundle = new MigrationsBundle<ExampleConfiguration>() {
        @Override
            public DataSourceFactory getDataSourceFactory(ExampleConfiguration configuration) {
                return configuration.getDatabase();
            }
    };
    
    public static void main(String[] args) throws Exception {
        new ExampleApplication().run(args);
    }
    
    @Override
    public void initialize(Bootstrap<ExampleConfiguration> bootstrap) {
        bootstrap.addBundle(migrationsBundle);
        
    }

    @Override
    public void run(ExampleConfiguration configuration, Environment environment) throws Exception {
        // TODO Auto-generated method stub
        
    }

}
