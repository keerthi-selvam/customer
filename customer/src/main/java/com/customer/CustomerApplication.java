/**
 * Contains the Customer application components.
 */
package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Entry point for the Customer Spring Boot application.
 */
@SpringBootApplication
public class CustomerApplication {

    /**
     * Starts the application and displays selected configuration properties.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(CustomerApplication.class, args);
        Environment env = context.getEnvironment();

        System.out.println("username = " + env.getProperty("username"));
        System.out.println("spring.datasource.username = "
                + env.getProperty("spring.datasource.username"));
    }
}
