package com.example.runnerz;

import com.example.runnerz.run.Location;
import com.example.runnerz.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class app {

	private static final Logger log = LoggerFactory.getLogger(app.class);


	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args ->{
			Run run = new Run(1, "Morning Run", LocalDateTime.now().minusHours(1),
					LocalDateTime.now(),5, Location.OUTDOOR);
			log.info("Run:" + run);

		};
	}

}
