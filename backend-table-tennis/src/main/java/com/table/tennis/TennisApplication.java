package com.table.tennis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@SpringBootApplication
@EnableJpaRepositories("com.table.tennis.repository")
@EntityScan("com.table.tennis.model.entity")
public class TennisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisApplication.class, args);
	}

}
