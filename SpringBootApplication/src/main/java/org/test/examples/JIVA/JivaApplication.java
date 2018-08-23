package org.test.examples.JIVA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("org.test")
@EnableMongoRepositories("org")
public class JivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JivaApplication.class, args);
	}
}
