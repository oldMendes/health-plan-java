package com.fernanda.healthPlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class HealthPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthPlanApplication.class, args);
	}

}
