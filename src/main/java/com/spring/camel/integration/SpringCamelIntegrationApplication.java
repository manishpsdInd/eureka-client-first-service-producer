package com.spring.camel.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:/sciProps/sci-app-${spring.profiles.active}.properties"}, ignoreResourceNotFound = true)
public class SpringCamelIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCamelIntegrationApplication.class, args);
	}
}