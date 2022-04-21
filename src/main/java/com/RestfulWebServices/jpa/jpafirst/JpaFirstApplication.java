package com.RestfulWebServices.jpa.jpafirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class JpaFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaFirstApplication.class, args);
	}

}
