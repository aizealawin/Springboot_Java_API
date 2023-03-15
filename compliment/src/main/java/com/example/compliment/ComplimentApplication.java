package com.example.compliment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ComplimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplimentApplication.class, args);

	}

}
