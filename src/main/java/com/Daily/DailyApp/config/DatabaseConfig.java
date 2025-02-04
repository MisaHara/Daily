package com.Daily.DailyApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.dailyapp.repository")
public class DatabaseConfig {
}
