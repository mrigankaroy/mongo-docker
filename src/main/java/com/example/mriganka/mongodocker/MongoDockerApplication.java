package com.example.mriganka.mongodocker;

import com.example.mriganka.mongodocker.config.MongoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({

		MongoConfiguration.class})
public class MongoDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDockerApplication.class, args);
	}

}
