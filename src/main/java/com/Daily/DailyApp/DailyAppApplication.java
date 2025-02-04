package com.Daily.DailyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.Daily.DailyApp")
@EnableJpaRepositories(basePackages = "com.Daily.DailyApp.repository")
@EntityScan(basePackages = "com.Daily.DailyApp.model")
public class DailyAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(DailyAppApplication.class, args);
	}
}