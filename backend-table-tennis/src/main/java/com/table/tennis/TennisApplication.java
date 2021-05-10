package com.table.tennis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.table.tennis.repository")
@EntityScan("com.table.tennis.model.entity")
public class TennisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisApplication.class, args);
	}

}
