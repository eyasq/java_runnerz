package com.example.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class app {

	private static final Logger log = LoggerFactory.getLogger(app.class);


	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
		log.info("Something changed");


	}

}
