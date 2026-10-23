package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(CustomerApplication.class, args);
        Environment env = context.getEnvironment();
        System.out.println("username = " + env.getProperty("username"));
        System.out.println("spring.datasource.username = "
                + env.getProperty("spring.datasource.username"));
        System.err.println("Username: " + env.getProperty("username"));
        System.err.println("Password: " + env.getProperty("password"));
	}

}
